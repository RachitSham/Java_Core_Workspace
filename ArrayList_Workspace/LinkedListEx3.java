package Array_Workspace.ArrayList_Workspace;

import java.util.*;
// Write a Java program to iterate through all elements in a linked list starting at the specified position.

public class LinkedListEx3 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Jhon");
        list.add("David");
        list.add("Frank");
        list.add("Peter");
        list.add("Jerry");

        System.out.println("Original Array:" + list);

        Iterator p = list.listIterator(1);

        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
