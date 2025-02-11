package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to check if a linked list is empty or not.
public class LinkedListEx25 {

    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original Linked List : " + linked);

        System.out.println("Check the LinkedList is empty or not !  " + linked.isEmpty());

        linked.removeAll(linked);

        System.out.println("LinkedList after remove all the elements : " + linked);
        System.out.println("Check the above linked list is empty or not ! " + linked.isEmpty());

    }
}
