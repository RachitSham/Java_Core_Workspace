package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

// Write a Java program to create a tree set, add some colors (strings) and print out the tree set.

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        System.out.println("Tree set: ");

        System.out.println(tree_set);
    }
}
