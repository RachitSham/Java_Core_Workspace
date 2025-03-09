// case-2 waiting of child thread until compliting main thread 
public class ThreadJoinMain extends Thread {

    static Thread mt;

    public void run() {
        try {
            // mt.join(); // without time period
            mt.join(10000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("krishna Thread");
        }
    }
}
/*
 * In the above example child thread calls join method on main thread object
 * hence child thread has to wait until completing main thread in this case
 * output is [main thread-10 times , child thread-10 times]
 * 
 */

class ThreadJoinMainDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinMain.mt = Thread.currentThread();

        ThreadJoinMain t = new ThreadJoinMain();
        t.start(); // starting main thread

        for (int i = 0; i < 10; i++) {
            System.out.println("Radha Thread");
            Thread.sleep(2000);
        }
    }
}
