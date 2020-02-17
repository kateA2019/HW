public class MyRunnable implements Runnable {
    // the way to STOP a thread
    private boolean doStop = false;
    public synchronized void doStop() { // signals to the Runnable to stop
        this.doStop = true;
        System.out.println("Stopping from thread " + Thread.currentThread().getName());
    }
    private synchronized boolean keepRunning() {
        return this.doStop == false;
    }
    @Override
    public void run() {
        while(keepRunning()) {
            System.out.println("Running from thread " + Thread.currentThread().getName());
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } // ** MAIN **
    public static void main (String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            Thread.sleep(2L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myRunnable.doStop(); //the ** stop ** method is called by a DIFFERENT / parent thread
    }
}
