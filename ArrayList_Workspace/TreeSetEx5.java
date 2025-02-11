package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

//  Write a Java program to get the first and last elements in a tree set.

public class TreeSetEx5 {

    public static void main(String[] args) {

        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        System.out.println("Original Tree Set : " + tree_set);

        Object first_element = tree_set.first();
        System.out.println("First Element is: " + first_element);

        Object last_element = tree_set.last();
        System.out.println("last Element is: " + last_element);
    }
}
