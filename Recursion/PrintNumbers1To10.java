package Recursion;

public class PrintNumbers1To10 {
    public static void printNumber(int n) {
        if (n == 11) {
            return;
        }
        System.out.print(n + " ");
        printNumber(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }
}
