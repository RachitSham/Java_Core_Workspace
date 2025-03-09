/* the default priorities only for the main thread is nothing but 5 ,
   but for all remaining thread default priorities will be inherited parent to child */
public class ThreadPrioritiesNine extends Thread {

    public void run() {

    }
}

class ThreadDemoPriorities {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority()); // By default main thread priorities is 5

        /*
         * if we trying to set the priorities of thread other than 1 to 10 so we will
         * get runtime exception [IllegalArgumentException]
         */
        // Thread.currentThread().setPriority(15);

        /*
         * if we comment the line 19 then by default the main thread priorities is 5 and
         * child thread priorities is also 5
         */
        Thread.currentThread().setPriority(7); // now main thread priorities is 7

        // Main thread creates child thread object
        ThreadPrioritiesNine t9 = new ThreadPrioritiesNine();
        // the child thread priorities is inherit from the parent thread
        System.out.println(t9.getPriority()); // child thread priorities is :7
    }
}