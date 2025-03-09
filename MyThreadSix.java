public class MyThreadSix extends Thread {
    public void start() {
        super.start();
        System.out.println("Start Method");
    }

    public void run() {
        System.out.println("Run Method");
    }
}

/*
 * Note: In this super.start() will call thread class start method and two
 * thread will be created Main thread is responsible to excute remaining and
 * child thread is responsible to execute run().
 */
class ThreadDemoSix {
    public static void main(String[] args) {
        MyThreadSix t6 = new MyThreadSix();
        t6.start();
        System.out.println("Main Thread");
    }
}
