// Overriding of start()
public class MyThreadFive extends Thread {

    public void strat() {
        System.out.println("Start Method");
    }

    public void run() {
        System.out.println("Rum Method");
    }
}

/*
 * Note: if we override start() then our class start() will be executed just
 * like normal method call and new thread won't created.
 * And total output will be produced by main thread.
 * It is not recommended to override start() otherwise don't go for
 * multithreading concept.
 */
class ThreadDemoFive {
    public static void main(String[] args) {
        MyThreadFive t5 = new MyThreadFive();
        t5.start();

        System.out.println("Main Thread");
    }
}
