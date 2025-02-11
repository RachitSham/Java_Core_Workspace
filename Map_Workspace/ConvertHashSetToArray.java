package Array_Workspace.Map_Workspace;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSetToArray {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Black");
        set.add("Green");
        set.add("Orange");
        set.add("Yellow");

        System.out.println("Original Hash Set: " + set);

        String[] arr = new String[set.size()];
        set.toArray(arr);

        System.out.println("Array Elements:");
        for (String elements : arr) {
            System.out.println(elements);
        }
    }
}
