package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to retrieve, but not remove, the first element of a linked list.

public class LinkedListEx20 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Purple");
        list.add("Brown");
        list.add("Pink");
        list.add("Olive");
        list.add("Black");

        System.out.println("Original LinkedList : " + list);

        String x = list.peekFirst();
        System.out.println("First Element in the List : " + x);

        System.out.println("New LinkedList : " + list);
    }
}
