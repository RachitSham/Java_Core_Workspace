package Array_Workspace.ArrayList_Workspace;

import java.util.Collections;
import java.util.LinkedList;

// Write a Java program that swaps two elements in a linked list.

public class LinkedList15 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList : " + linked);

        Collections.swap(linked, 1, 3);
        Collections.swap(linked, 2, 4);

        System.out.println("swap linked list : " + linked);
    }
}
