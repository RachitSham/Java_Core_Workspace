// Note: but in case of run() no new thread will be create, Just it will executed just like a normal method by main thread. 
public class MyThreadTwo extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

/*
 * Note: In case of t2.start() a new thread will be created which is responsible
 * for executeion of the run method
 * If we replace t2.start() with t2.run() then the output will be [child thread,
 * child thread 10-times] And [Main thread, Main thread 10-times].
 * This total output produced by main thread.
 */
class ThreadDemoTwo {
    public static void main(String[] args) {

        MyThreadTwo t2 = new MyThreadTwo();
        t2.start(); // strating a thread

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}