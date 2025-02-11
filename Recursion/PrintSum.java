package Recursion;

public class PrintSum {
    public static void sumNaturalNo(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumNaturalNo(i + 1, n, sum);
        System.out.println(i);
    }

    public static void main(String[] args) {

        sumNaturalNo(1, 10, 0);
    }
}
