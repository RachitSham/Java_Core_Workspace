public class MyThreadRunnableSeven implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) { // this line is executed by child thread
            System.out.println("Child Thread");
        }
    }
}

/*
 * step1 - first we have to create MyThreadRunnableSeven Object and this line
 * executed by main thread..
 * My runnable is ready to start but someone is required to start . and runnable
 * doesn't contain start() and its parent also.
 * thread has the start capabilitiy so, we have to cretae thread object.
 * thread class run() has empty implementation
 * we will get mixed output and we can't tell exact output
 */
class ThreadRunnableDemoSeven {
    public static void main(String[] args) {
        MyThreadRunnableSeven r = new MyThreadRunnableSeven(); // creating runnable object

        // creating a thread to call thread class start()
        Thread t = new Thread(r); // creating a thread object
        t.start(); // Starting a thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
