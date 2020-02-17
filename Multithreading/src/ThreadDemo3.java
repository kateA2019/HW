    public class ThreadDemo3 extends Thread{
// 1 option - implementing the Runnable interface
//public class ThreadDemo3 implements Runnable{
// 2 option - extending a Thread class
//public class ThreadDemo3 extends Thread{
        private Thread t;
        private String name;
        ThreadDemo3(String name){
            this.name = name;
            System.out.println("Creating " + this.name);
        }
        public void run (){
            System.out.println("Running " +  name );
            try {
                for (int i=4; i>0; i--){
                    System.out.println("Thread: " + name + ", " + i);
                    // Let the thread sleep for a while.
                    Thread.sleep(50);
                }
            } catch (InterruptedException e){
                System.out.println("Thread " +  name + " interrupted.");
            }
            System.out.println("Thread " +  name + " exiting.");
        }
        /*public void start () {
            System.out.println("Starting " + name);
            if (t ==null) {
                t = new Thread (this, name);
                System.out.println("thread  = " + t);
                t.start();
            }
        }*/
        // ** MAIN **
        public static void main(String args[]) {
            ThreadDemo3 T1 = new ThreadDemo3("Thread-1");
            T1.start();
            ThreadDemo3 T2 = new ThreadDemo3 ("Tread-2");
            T2.start();
            //2nd example

            Thread thread = Thread.currentThread(); // assigning 'thread' to the current / parent thread
            // Thread.currentThread() method returns a reference to the Thread instance executing currentThread() >> the parent thread
            System.out.println(Thread.currentThread().getName());
        }

    }