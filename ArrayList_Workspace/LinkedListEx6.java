package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to insert some elements at the specified position into a linked list.

public class LinkedListEx6 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList:" + linked);

        LinkedList<String> new_linked = new LinkedList<>();
        new_linked.add("Grey");
        new_linked.add("White");

        linked.addAll(0, new_linked);

        System.out.println("New LinkedList: " + linked);
    }
}
