package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

public class LinkedListEx26 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original Linked List : " + linked);

        System.out.println("The value of First element changed.");
        linked.set(1, "Pink");

        System.out.println("The value of Second element changed.");
        linked.set(2, "Black");

        System.out.println(linked);
    }
}
