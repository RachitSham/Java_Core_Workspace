package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to insert the specified element at the specified position in the linked list.

public class LinkedListEx5 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Jhon");
        list.add("David");
        list.add("Frank");
        list.add("Peter");
        list.add("Jerry");

        System.out.println("Original Linkedlist:");

        System.out.println("Let add the name Kevin after Jhon: " + list);

        list.add(1, "Kevin");

        System.out.println("Updated Linkedlist:" + list);

    }
}
