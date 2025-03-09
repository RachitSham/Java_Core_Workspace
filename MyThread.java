public class MyThread extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
    }
}

/*
 * case -4 if a thread join method call on the same thread itself then the
 * program will be stuck [this is something like deadlock]
 * in this case thread has to wait infinite amount of time
 */