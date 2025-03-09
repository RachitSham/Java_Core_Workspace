// overriding of run()
public class MyThreadFour extends Thread {

}

/*
 * Note: if we are not overriding run() then thread class run() will be executed
 * which has empty implementation.henece we won't get any output..
 * it is highly recommended to override run () otherwise don't go for
 * mulithreading concept..
 */
class ThreadDemoFour {
    public static void main(String[] args) {
        MyThreadFour t4 = new MyThreadFour();
        t4.start();
    }
}