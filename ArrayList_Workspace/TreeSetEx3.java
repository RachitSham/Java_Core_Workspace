package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

// Write a Java program to add all the elements of a specified tree set to another tree set.

public class TreeSetEx3 {

    public static void main(String[] args) {

        TreeSet<String> tree_set_One = new TreeSet<String>();
        tree_set_One.add("Red");
        tree_set_One.add("Green");
        tree_set_One.add("Orange");
        tree_set_One.add("White");
        tree_set_One.add("Black");

        System.out.println("Original Tree Set : " + tree_set_One);

        TreeSet<String> tree_set_Two = new TreeSet<String>();
        tree_set_Two.add("Yellow");
        tree_set_Two.add("Pink");
        tree_set_Two.add("Blue");
        tree_set_Two.add("Olive");

        System.out.println("Original New Tree Set : " + tree_set_Two);

        tree_set_One.addAll(tree_set_Two);

        System.out.println("tree_set : " + tree_set_One);
    }
}
