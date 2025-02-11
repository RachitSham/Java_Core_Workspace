package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// 2. Write a Java program to iterate through all elements in an array list.

public class ArrayListEx2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Black");
        list.add("Green");
        list.add("Orange");
        list.add("Yellow");

        for (String element : list) {
            System.out.println(" ArrayList Elements: " + element);
        }
    }
}
