package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

//Write a Java program to display elements and their positions in a linked list.

public class LInkedListEx11 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Original LinkedList : " + linked);

        for (int p = 0; p < linked.size(); p++) {
            System.out.println("Element at index " + p + " : " + linked.get(p));
        }
    }
}
