package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

public class LinkedListEx21 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Purple");
        list.add("Brown");
        list.add("Pink");
        list.add("Olive");
        list.add("Black");

        System.out.println("Original LinkedList : " + list);

        String last = list.peekLast();
        System.out.println("Last Element in the List : " + last);

        System.out.println("New LinkedList : " + list);
    }
}
