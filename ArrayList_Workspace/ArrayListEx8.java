package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.Collections;

//8. Write a Java program to sort a given array list.

public class ArrayListEx8 {

    public static void main(String[] args) {

        ArrayList<String> sortList = new ArrayList<>();
        sortList.add("Harry Potter");
        sortList.add("James Bond");
        sortList.add("Virat Kholi");
        sortList.add("Rohit Sharma");
        sortList.add("Ms Dhoni");
        sortList.add("Narendra Modi");

        System.out.println("Original ArrayList: " + sortList);
        Collections.sort(sortList);

        System.out.println();

        System.out.println("Sorted ArrayList: " + sortList);
    }
}
