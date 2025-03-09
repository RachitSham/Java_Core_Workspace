// Overloading in run method 
public class MyThreadThree extends Thread {
    public void run() {
        System.out.println("no-args run method");
    }

    public void run(int n) {
        System.out.println("int-args run method");
    }
}

/*
 * Note: Overloading of the run method is always possible but thread class
 * strat() will always call [no-args run method only]
 * the other overloaded method we have to call explicitly then only this method
 * will be executed just like a normal method
 */
class ThreadDemoThree {
    public static void main(String[] args) {
        MyThreadThree t3 = new MyThreadThree();
        t3.start();
    }
}
