package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

//7. Write a Java program to search for an element in an array list.

public class ArrayListEx7 {
    public static void main(String[] args) {

        ArrayList<String> searchList = new ArrayList<>();

        searchList.add("Red");
        searchList.add("Black");
        searchList.add("Green");
        searchList.add("Orange");
        searchList.add("Yellow");

        if (searchList.contains("Yellow")) {
            System.out.println("Search Element exists !! ");
        } else {
            System.out.println("Search Element not exists !! ");
        }

    }
}
