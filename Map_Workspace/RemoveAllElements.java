package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class RemoveAllElements {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Red");
        set.add("Brown");
        set.add("Green");
        set.add("Yellow");

        System.out.println("Original HashSet Contains : " + set);

        set.clear();

        System.out.println("HashSet Content: " + set);
    }
}
