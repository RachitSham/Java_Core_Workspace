package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class CompareSetsAndRetainAll {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<String>();

        set1.add("Red");
        set1.add("Brown");
        set1.add("Green");
        set1.add("Yellow");

        System.out.println("First HashSet Contains : " + set1);

        HashSet<String> set2 = new HashSet<String>();

        set2.add("Red");
        set2.add("Brown");
        set2.add("Green");
        set2.add("Yellow");

        System.out.println("First HashSet Contains : " + set2);

        set1.retainAll(set2);
        System.out.println("HashSet Content: ");

        System.out.println(set1);
    }
}
