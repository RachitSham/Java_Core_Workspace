package Recursion;

import java.util.Scanner;

public class RecursionStackHeightLog {
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        // if n is even
        if (n % 2 == 0) {
            return printPower(x, n / 2) * printPower(x, n / 2);
        } else {
            return printPower(x, n / 2) * printPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :- ");
        int x = sc.nextInt();

        System.out.println("Enter The Power");
        int n = sc.nextInt();

        int ans = printPower(x, n);

        System.out.println("The Calculated Power Is :- " + ans);
    }
}

// By Using This Trick The Stack height is logn .