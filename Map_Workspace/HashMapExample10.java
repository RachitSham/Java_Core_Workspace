package Array_Workspace.Map_Workspace;

import java.util.HashMap;

//Write a Java program to get the value of a specified key in a map.

public class HashMapExample10 {

    public static void main(String[] args) {

        HashMap<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        String val = (String) hash_map.get(1);

        System.out.println("The Value of a specified key in the map: " + val);

    }
}
