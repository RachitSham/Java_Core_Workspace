package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to remove and return the first element of a linked list.

public class LinkedListEx19 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Purple");
        list.add("Brown");
        list.add("Pink");
        list.add("Olive");
        list.add("Black");

        System.out.println("Original LinkedList : " + list);

        System.out.println("Removed Element : " + list.pop());

        System.out.println("Linked list after pop operation : " + list);

    }
}
