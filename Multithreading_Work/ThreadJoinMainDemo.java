public class ThreadJoinMainDemo extends Thread {

    static Thread mt;

    public void run() {
        try {
            mt.join();

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Krishna Thread");
        }
    }
}

/*
 * if main method calls join method on child thread object and child thread
 * calls join method on main thread object then both thread will wait forever
 * and the program will be stuck [this is something like deadlock].
 */

class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinMainDemo.mt = Thread.currentThread();
        ThreadJoinMainDemo t = new ThreadJoinMainDemo();
        t.start();
        t.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Radha Thread");
        }
    }
}