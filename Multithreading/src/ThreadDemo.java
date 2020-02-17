public class ThreadDemo implements Runnable{
    Thread t;
    public static int count=1;
    ThreadDemo() {
        t = new Thread(this, "Admin-" + count);  // thread created
        System.out.println("thread = " + t);
        System.out.println("Calling run() function for "+ t.getName());
        t.start();                              // this will call run() function
        count++;                                // for naming purposes
    }
    public void run() {
        System.out.println("Inside run() function of " + t.getName());
    }

    // ** MAIN **
    public static void main(String args[]) {
        new ThreadDemo();
        new ThreadDemo();
        new ThreadDemo();

        // 2nd example > calling start() without a Thread variable:
        for(int i=1; i<5; i++) {
            new Thread("t" + i) {
                public void run() {
                    System.out.println("Thread: " + getName() + " is running");
                }
            }.start();
        }
    }

}
