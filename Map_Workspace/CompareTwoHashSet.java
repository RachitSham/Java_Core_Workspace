package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class CompareTwoHashSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");

        System.out.println("Original HashSet : " + set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Red");
        set1.add("Pink");
        set1.add("Black");
        set1.add("Orange");

        System.out.println("Original HashSet One : " + set1);

        HashSet<String> result_Set = new HashSet<String>();

        for (String element : set) {
            System.out.println(set1.contains(element) ? "YES" : "No");
        }

    }
}
