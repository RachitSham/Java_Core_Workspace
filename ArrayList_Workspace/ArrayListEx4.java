package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

public class ArrayListEx4 {

    public static void main(String[] args) {

        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original ArrayList: " + list_Strings);

        list_Strings.set(0, "Blue");
        list_Strings.set(3, "Pink");

        System.out.println();
        System.out.println("Updated ArrayList: " + list_Strings);
    }
}
