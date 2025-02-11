package Array_Workspace.Map_Workspace;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ConvertListToArrayList {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();

        set.add("RaviTeja");
        set.add("Prabhas");
        set.add("Allu Arjun");
        set.add("Junior NTR");
        set.add("Mashesh Babu");

        System.out.println("Original Tree Set: " + set);

        List<String> al = new ArrayList<>(set);
        System.out.println("ArrayList Contains: " + al);

    }

}
