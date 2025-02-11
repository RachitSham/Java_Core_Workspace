package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

//  Write a Java program to compare two linked lists.

public class LinkedListEx24 {
    public static void main(String[] args) {

        LinkedList<String> list_One = new LinkedList<>();
        list_One.add("Purple");
        list_One.add("Brown");
        list_One.add("Pink");
        list_One.add("Olive");
        list_One.add("Black");

        LinkedList<String> list_Two = new LinkedList<>();
        list_Two.add("Purple");
        list_Two.add("Brown");
        list_Two.add("Pink");
        list_Two.add("Orange");

        LinkedList<String> list_Three = new LinkedList<>();

        for (String e : list_One) {
            list_Three.add(list_Two.contains(e) ? "Yes" : "No");

            System.out.println(list_Three);
        }
    }
}
