package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class CloneHashSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("David");
        set.add("Peter");
        set.add("Frank");
        set.add("Jerry");

        System.out.println("Original Hash Set: " + set);

        HashSet<String> new_Set = new HashSet<String>();
        new_Set = (HashSet) set.clone();

        System.out.println("Cloned HashSet: " + new_Set);
    }
}
