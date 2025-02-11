package Array_Workspace.Map_Workspace;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetAllFunction {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Insert/add the element ins HashSet
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);

        // size
        System.out.println(" size of the Set is: " + set.size());

        // print all elements
        System.out.println("all Element of set : " + set);

        // Search - contains

        // if (set.contains(1)) {
        // System.out.println("Set Contains 1 ");
        // }

        // if (!set.contains(6)) {
        // System.out.println("does not Contains");
        // }

        // Delete
        // set.remove(1);
        // if (!set.contains(1)) {
        // System.out.println("does not contains 1 - we Deleted.");
        // }

        // Iterator
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
