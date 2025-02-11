package Array_Workspace.Map_Workspace;

import java.util.HashMap;

//Write a Java program to get a shallow copy of a HashMap instance.

public class HashMapExample6 {

    public static void main(String[] args) {

        HashMap<Integer, String> map_Hash = new HashMap<>();
        map_Hash.put(111, "Ravi");
        map_Hash.put(222, "Arjun");
        map_Hash.put(333, "Bhairav");
        map_Hash.put(444, "Ram");
        map_Hash.put(555, "Sundaram");

        System.out.println("Original HashMap:  " + map_Hash);

        HashMap<Integer, String> new_hash_map = new HashMap<>();
        new_hash_map = (HashMap) map_Hash.clone();
        System.out.println("Cloned Map: " + new_hash_map);
    }
}
