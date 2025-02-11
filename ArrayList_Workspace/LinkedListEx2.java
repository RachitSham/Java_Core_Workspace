package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to iterate through all elements in a linked list.

public class LinkedListEx2 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList:" + linked);

        for (String element : linked) {
            System.out.println(element);
        }
    }
}
