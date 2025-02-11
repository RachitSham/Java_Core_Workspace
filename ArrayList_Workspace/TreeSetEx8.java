package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

/**
 * Write a Java program to compare two tree sets
 */
public class TreeSetEx8 {
    public static void main(String[] args) {

        TreeSet<String> tree_set_one = new TreeSet<String>();
        tree_set_one.add("Red");
        tree_set_one.add("Green");
        tree_set_one.add("Orange");
        tree_set_one.add("White");
        tree_set_one.add("Black");

        System.out.println("Original Tree Set" + tree_set_one);

        TreeSet<String> tree_set_two = new TreeSet<String>();
        tree_set_two.add("Red");
        tree_set_two.add("Yellow");
        tree_set_two.add("Orange");
        tree_set_two.add("White");

        System.out.println("Original Tree Set" + tree_set_two);

        TreeSet<String> tree_set_comp = new TreeSet<String>();

        for (String element : tree_set_one) {
            System.out.println(tree_set_two.contains(element) ? "Yes" : "No");
        }
    }

}