package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to remove a specified element from a linked list.

public class LInkedListEx12 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList : " + linked);

        linked.remove(3);

        System.out.println("New Linked List : " + linked);
    }
}
