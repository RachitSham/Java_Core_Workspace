package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

//Write a Java program to retrieve and remove the first element of a tree set.

public class TreeSetEx14 {

    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        System.out.println("Tree set: ");
        System.out.println(tree_set);

        tree_set.removeFirst();

        // After removeing the first Element

        System.out.println("New Tree Set: " + tree_set);
    }
}
