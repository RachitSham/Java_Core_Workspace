package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to get the first and last occurrence of the specified elements in a linked list.

public class LinkedListEx10 {

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList: " + linked);

        System.out.println("First Occurance : " + linked.getFirst());

        System.out.println("Last Occurance : " + linked.getLast());
    }
}
