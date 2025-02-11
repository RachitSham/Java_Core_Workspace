package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

// Write a Java program to check if a particular element exists in a linked list.

public class LinkedListEx22 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Purple");
        list.add("Brown");
        list.add("Pink");
        list.add("Olive");
        list.add("Black");

        System.out.println("Original LinkedList : " + list);

        // check if purple color is exists or not

        if (list.contains("Purple")) {
            System.out.println("Color Purple is PRESENT in the linked list");
        } else {
            System.out.println("Color Purple is NOT present in the linked list");
        }

        // check if Orange color is exists or not

        if (list.contains("Orange")) {
            System.out.println("Color Orange is PRESENT in the linked list");
        } else {
            System.out.println("Color Orange is NOT present in the linked list");
        }
    }
}
