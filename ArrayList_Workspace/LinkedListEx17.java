package Array_Workspace.ArrayList_Workspace;

import java.util.Collections;
import java.util.LinkedList;

// Write a Java program to join two linked lists.

public class LinkedListEx17 {

    public static void main(String[] args) {

        LinkedList<String> list_one = new LinkedList<>();
        list_one.add("Red");
        list_one.add("Blue");
        list_one.add("Green");
        list_one.add("Yellow");
        list_one.add("Orange");

        System.out.println("Original Linked_List_One : " + list_one);

        LinkedList<String> list_two = new LinkedList<>();
        list_two.add("Purple");
        list_two.add("Brown");
        list_two.add("Pink");
        list_two.add("Olive");
        list_two.add("Black");

        System.out.println("Original Linked_List_One : " + list_two);

        LinkedList<String> join_List = new LinkedList<>();

        join_List.addAll(list_one);
        join_List.addAll(list_two);

        System.out.println("New Linked List : " + join_List);
    }
}
