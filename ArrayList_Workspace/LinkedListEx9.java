package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to insert the specified element at the end of a linked list.

public class LinkedListEx9 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList:" + linked);

        linked.offerLast("White");

        System.out.println("Updated LinkedList:" + linked);
    }
}
