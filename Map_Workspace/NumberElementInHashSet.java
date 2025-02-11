package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class NumberElementInHashSet {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(10001);
        set.add(20002);
        set.add(30003);
        set.add(40004);
        set.add(50005);

        System.out.println("HashSet: " + set);

        System.out.println("to get the number of elements in a hash set:" + set.size());
    }
}
