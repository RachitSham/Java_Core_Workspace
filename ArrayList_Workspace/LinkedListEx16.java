package Array_Workspace.ArrayList_Workspace;

import java.util.Collections;
import java.util.LinkedList;

// Write a Java program to shuffle elements in a linked list.

public class LinkedListEx16 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList : " + linked);

        Collections.shuffle(linked);

        System.out.println("Shuffle LinkedList : " + linked);
    }
}
