package Array_Workspace.Map_Workspace;

import java.util.HashSet;

public class EmptyHashSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Springboot");
        set.add("Aws");
        set.add("Hibernate");
        set.add("Data Structure");
        set.add("Python");

        System.out.println("HashSet: " + set);

        set.removeAll(set);
        System.out.println("Removing all Elements from HashSet: " + set);
    }

}
