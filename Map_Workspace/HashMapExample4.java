package Array_Workspace.Map_Workspace;

import java.util.HashMap;

// Write a Java program to remove all mappings from a map.

public class HashMapExample4 {

    public static void main(String[] args) {

        HashMap<Integer, String> hash_map = new HashMap<>();

        hash_map.put(1, "Margaret");
        hash_map.put(2, "Jessica");
        hash_map.put(3, "Jasmin");
        hash_map.put(4, "Rubicaa");
        hash_map.put(5, "Sophia");

        System.out.println("Size of hash map: " + hash_map.size());

        System.out.println("Original Hash Map: " + hash_map);

        hash_map.clear();
        System.out.println(" New Hash Map: " + hash_map);
    }
}
