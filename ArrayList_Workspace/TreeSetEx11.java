package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

// Write a Java program to get the element in a tree set less than or equal to the given element.

public class TreeSetEx11 {

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

        System.out.println("Less than or Equal to 44: " + tree_num.floor(44));

        System.out.println("Less than or Equal to 105: " + tree_num.floor(105));
    }
}
