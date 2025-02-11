package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

// Write a Java program to remove a given element from a tree set.

public class TreeSetEx16 {

    public static void main(String[] args) {

        TreeSet<Integer> tree_num = new TreeSet<Integer>();

        tree_num.add(10);
        tree_num.add(27);
        tree_num.add(39);
        tree_num.add(44);
        tree_num.add(59);
        tree_num.add(60);
        tree_num.add(74);
        tree_num.add(85);
        tree_num.add(91);
        tree_num.add(105);

        System.out.println("Original Tree Set: " + tree_num);

        System.out.println("Remove 60 from the tree set: " + tree_num.remove(60));

        System.out.println("Tree Set after removing the element: " + tree_num);
    }
}
