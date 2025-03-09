public class ThreadInterrupt extends Thread {

    public void run() {
        for (int i = 0; i < 50000; i++) {
            System.out.println("I am a Lazy Thread:- " + i);
        }
        System.out.println("I am entering into sleeping state ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}
/*
 * note: whenever we calling interrupt() if the target thread not in sleeping
 * state or witing state then there is no impact of interrupt call immediately
 * interrupt call be waited until target thread entered into sleeping or waiting
 * state
 * if the target thread enter into sleeping or waiting state then immediately
 * interrupt call will interrupt the target thread.
 * 
 * if the target thread never intered into sleeping or waiting state in its life
 * time then there is no impact of interrupt call...this is only case where
 * interrupt call will be wasted.
 * 
 * in the above example interrupt call waited until child thread complete for
 * loop 5000 times
 */

class ThreadInterruptDemo {
    public static void main(String[] args) {

        ThreadInterrupt t = new ThreadInterrupt();
        t.start();
        t.interrupt();

        System.out.println("End of main Thread");
    }
}
