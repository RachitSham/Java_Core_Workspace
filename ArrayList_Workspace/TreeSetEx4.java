package Array_Workspace.ArrayList_Workspace;

import java.util.Iterator;
import java.util.TreeSet;

// Write a Java program to create a reverse order view of the elements contained in a given tree set.

public class TreeSetEx4 {

    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");

        System.out.println("Original Tree Set : " + tree_set);

        Iterator it = tree_set.descendingIterator();

        System.out.println("Element in Reverse Order !! ");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
