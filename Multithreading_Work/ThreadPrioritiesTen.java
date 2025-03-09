public class ThreadPrioritiesTen extends Thread {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread -1");
        }
    }
}

class ThreadPrioritiesDemo {
    public static void main(String[] args) { // by default main thread priorities is 5

        ThreadPrioritiesTen t10 = new ThreadPrioritiesTen();
        t10.setPriority(10); // stting child thread priorities is 10
        t10.start();// starting the thread

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread-1");
        }
    }
}

/*
 * if we are commenting line 1 then both main and child threads have the same
 * priorities 5 and hence we can't except exact execution order and exact output
 * 
 * if we not commenting line 1 then main thread has a priorities 5 and child
 * thread has the priorities 10 hence child thread will get the chance first
 * followed by main thread() in this case output is [child thread-child thread
 * 5 times followed by main thread-main thread 5 times]
 * 
 * note - some platform won't provide proper support for thread priorities
 */