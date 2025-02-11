package Recursion;

import java.util.Scanner;

public class FactorialRecursion {
    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calculateFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Calculate The Factorial Of Given No :-");
        int n = sc.nextInt();

        int ans = calculateFactorial(n);
        System.out.println("The Factorial Of Given No :- " + ans);
    }
}
