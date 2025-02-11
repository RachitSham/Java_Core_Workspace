package Array_Workspace.ArrayList_Workspace;

import java.util.TreeSet;

// Write a Java program to get an element in a tree set that has a lower value than the given element.

public class TreeSetEx13 {

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

        System.out.println("Strictly less than 27 : " + tree_num.lower(27));
        System.out.println("Strictly less than 59 : " + tree_num.lower(59));
    }
}
