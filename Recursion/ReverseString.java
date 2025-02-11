package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void printreverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printreverse(str, idx - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String To Reverse It .");

        String str = sc.nextLine();
        printreverse(str, str.length() - 1);
    }
}
