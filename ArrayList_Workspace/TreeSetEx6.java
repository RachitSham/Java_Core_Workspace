package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

// Write a Java program to clone a tree set list to another tree set.

public class TreeSetEx6 {

    public static void main(String[] args) {

        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        System.out.println("Original Tree Set" + tree_set);

        @SuppressWarnings("unchecked")
        TreeSet<String> tree_sets = (TreeSet<String>) tree_set.clone();

        System.out.println("Clone Tree Set : " + tree_set);
    }
}
