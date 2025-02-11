package Array_Workspace.Map_Workspace;

import java.util.HashMap;
import java.util.*;

//Write a Java program to get a set view of the keys contained in this map.

public class HashMapExample11 {

    public static void main(String[] args) {

        HashMap<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        Set keySet = hash_map.keySet();

        System.out.println("KeySet Value are: " + keySet);
    }
}
