package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.Collections;

//9. Write a Java program to copy one array list into another.

public class ArrayListEx9 {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Harry Potter");
        listOne.add("James Bond");
        listOne.add("Virat Kholi");

        System.out.println("List One:" + listOne);

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("Rohit Sharma");
        listTwo.add("Ms Dhoni");
        listTwo.add("Narendra Modi");

        System.out.println("List Two: " + listTwo);

        Collections.copy(listOne, listTwo);

        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + listOne);
        System.out.println("List2: " + listTwo);
    }
}
