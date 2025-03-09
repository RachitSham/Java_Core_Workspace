// defining a thread
public class MyThreadOne extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) { // executed by child thread
            System.out.println("Child Class");
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        MyThreadOne t1 = new MyThreadOne();
        t1.start(); // strating a thread

        for (int i = 0; i < 5; i++) { // executed by main thread
            System.out.println("Main Thread");
        }
    }
}
