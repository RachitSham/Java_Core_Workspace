package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.Collections;

// Write a Java program that swaps two elements in an array list.

public class ArrayListEx14 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println("Array List Before Swap:");
        for (String a : list) {
            System.out.println(a);
        }
        System.out.println("********************");

        Collections.swap(list, 0, 3);

        System.out.println("Array List after swap:");

        for (String b : list) {
            System.out.println(b);
        }
    }
}
