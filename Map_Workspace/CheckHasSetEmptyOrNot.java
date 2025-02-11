package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class CheckHasSetEmptyOrNot {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Collections");
        set.add("Garbage Collector");
        set.add("Multithreading");
        set.add("Lang Package");
        set.add("Exception Handling");

        System.out.println("HashSet:" + set);
        if (set.isEmpty()) {
            System.out.println("Above List is Not Empty:-");
        }
        System.out.println("Remove All Elements From the Set:- ");
        set.removeAll(set);

        System.out.println("Hash Set after removing all the elements: " + set);

    }
}
