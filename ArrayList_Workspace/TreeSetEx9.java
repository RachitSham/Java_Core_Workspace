package Array_Workspace.ArrayList_Workspace;

import java.util.Iterator;
import java.util.TreeSet;

// Write a Java program to find numbers less than 7 in a tree set.

public class TreeSetEx9 {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();

        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(4);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);

        System.out.println("Original Tree Set" + tree_num);

        treeheadset = (TreeSet) tree_num.headSet(7);

        // create an iterator
        Iterator iterator;
        iterator = treeheadset.iterator();

        System.out.println("Tree set data: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
