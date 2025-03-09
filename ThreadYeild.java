public class ThreadYeild extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread ");
            Thread.yield();
        }
    }
}

/*
 * in the above program if we are commenting line one then both thread will be
 * excyted simultaneously and we expect which thread will complete first.
 * 
 * if we are not commenting line 1 then child thread always calls yeild method
 * beacause of that main thread wil get chance more no of times and the chance
 * of completing main thread first is high
 * 
 * note: some platform won't support for yeild method
 * 
 * What is the purpose of yeild method
 * yeild method causes to pass current executing thread to give chance for
 * remaining waiting thread of same priorities
 */
class ThreadYeildDemo {
    public static void main(String[] args) {

        ThreadYeild t = new ThreadYeild();
        t.start(); // starting a thread

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
