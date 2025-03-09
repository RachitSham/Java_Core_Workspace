public class ThreadSleepSlideRotater extends Thread {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Hello Slider Rotater-" + i);
            Thread.sleep(5000);
        }
    }

}
