package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to insert elements into the linked list at the first and last positions.

public class LinkedListEx7 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList:" + linked);

        // Add an element at the beginning
        linked.addFirst("Purple");

        // Add an element at the last
        linked.addLast("Pink");

        System.out.println("the linked list at the first and last positions:" + linked);
    }
}
