package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

/**
 * Write a Java program to get the number of elements in a tree set.
 */
public class TreeSetEx7 {

    public static void main(String[] args) {

        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        System.out.println("Original Tree Set" + tree_set);

        System.out.println("Size of the tree set: " + tree_set.size());
    }
}
