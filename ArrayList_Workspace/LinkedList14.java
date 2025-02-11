package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

public class LinkedList14 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList : " + linked);

        linked.removeAll(linked);

        System.out.println("New LinkedList : " + linked);
    }
}
