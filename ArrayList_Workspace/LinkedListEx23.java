package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.LinkedList;

// Write a Java program to convert a linked list to an array list.

public class LinkedListEx23 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Purple");
        list.add("Brown");
        list.add("Pink");
        list.add("Olive");
        list.add("Black");

        System.out.println("Original LinkedList : " + list);

        // convert it into ArrayList

        ArrayList<String> array_List = new ArrayList<String>(list);

        for (String element : array_List) {
            System.out.println(element);
        }
    }
}
