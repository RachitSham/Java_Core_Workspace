package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// Write a Java program to empty an array list.

public class ArrayListEx16 {

    public static void main(String[] args) {

        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original ArrayList:" + list_Strings);

        list_Strings.removeAll(list_Strings);

        System.out.println("ArrayList After remove all Element:" + list_Strings);
    }
}
