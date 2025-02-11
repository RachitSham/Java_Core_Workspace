package Array_Workspace.ArrayList_Workspace;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

// Write a Java program to iterate a linked list in reverse order.

public class LinkedListEx4 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Jhon");
        list.add("David");
        list.add("Frank");
        list.add("Peter");
        list.add("Jerry");

        System.out.println("Original LinkedList:" + list);

        Iterator it = list.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
