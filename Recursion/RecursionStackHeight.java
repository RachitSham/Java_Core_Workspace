package Recursion;

import java.util.Scanner;

public class RecursionStackHeight {
    public static int calculatePower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = calculatePower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :- ");
        int x = sc.nextInt();

        System.out.println("Enter The Power");
        int n = sc.nextInt();

        int ans = calculatePower(x, n);

        System.out.println("The Calculated Power Is :- " + ans);
    }
}
