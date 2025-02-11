package Array_Workspace.Map_Workspace;

import java.util.HashSet;
import java.util.Iterator;

/**
 * IterateElementsInHashMap
 */
public class IterateElementsInHashSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Durga");
        set.add("Shiva");
        set.add("Jaspreet");
        set.add("Anshika");

        System.out.println("All Elements of Set: " + set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println("to iterate through all elements in a hash list: " + it.next());

        }
    }
}