// how a thread can interrupt another thread
public class ThreadInterruption extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I Am A Lazy Thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException ie) {
            System.out.println("I Got Interrupted ");
        }
    }
}
/*
 * if we comment line 1 then main thread won't interrupt child thread in this
 * case child thread for loop 10 times
 * if we are not comment line 1 then main thread interrupt child thread in this
 * case output is [End of main, I Am A Lazy Thread, I Got Interrupted]
 */

class ThreadInterruptionDemo {
    public static void main(String[] args) {
        ThreadInterruption t = new ThreadInterruption();
        t.start();
        t.interrupt();// line 1

        System.out.println("End of main");
    }
}