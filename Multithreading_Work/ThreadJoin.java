public class ThreadJoin extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Seetha Thread");

            try {

                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

/*
 * waiting of main thread until compliting child thread..
 * if we commenting line one then both main and child thread excuted
 * simultaneously and we cann't expect output
 * if we are not commenting line one then main thread call join method on child
 * thread object and hence main thread will wait until completing child thread
 * in this case output is [seetha thread -10 times followed by rama thread -10
 * times]
 */
class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {

        ThreadJoin t = new ThreadJoin();
        t.start(); // starting a thread
        // t.join(); // without time period Line-1
        t.join(10000); // with time period
        for (int i = 0; i < 10; i++) {
            System.out.println("Rama Thread");
        }

    }
}
