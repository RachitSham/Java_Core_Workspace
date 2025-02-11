package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// 1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

public class ArrayListEx1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Red");
        al.add("Black");
        al.add("Green");
        al.add("Orange");
        al.add("Yellow");

        System.out.println("Collection of Colors: " + al);
    }
}
