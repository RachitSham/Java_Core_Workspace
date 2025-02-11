package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

public class LinkedListEx18 {

    public static void main(String[] args) {

        LinkedList<String> list_One = new LinkedList<>();
        list_One.add("Purple");
        list_One.add("Brown");
        list_One.add("Pink");
        list_One.add("Olive");
        list_One.add("Black");

        System.out.println("Original LinkedList : " + list_One);

        LinkedList<String> new_List = new LinkedList<>();
        new_List = (LinkedList) list_One.clone();

        System.out.println("Clone Linked List: " + new_List);
    }
}
