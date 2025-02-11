package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// Write a Java program for trimming the capacity of an array list.

public class ArrayLIstEx18 {

    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original ArrayList:" + list_Strings);

        System.out.println("Let's trim the size of the ArrayList: ");
        list_Strings.trimToSize();

        System.out.println(list_Strings);
    }

}
