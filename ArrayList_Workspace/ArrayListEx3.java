package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// 3. Write a Java program to insert an element into the array list at the first position.

public class ArrayListEx3 {
    public static void main(String[] args) {

        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original Array: " + list_Strings);

        list_Strings.add(0, "Olive");
        list_Strings.add(4, "Blue");

        System.out.println("Updated ArrayList : " + list_Strings);
    }
}
