package Array_Workspace.Map_Workspace;

//Write a Java program to copy all mappings from the specified map to another map.

import java.util.HashMap;

public class HashMapExample3 {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Green");
        map1.put(2, "Black");
        map1.put(3, "Yellow");
        map1.put(4, "Red");

        System.out.println("Values Of First Map: " + map1);

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(5, "Olive");
        map2.put(6, "Purple");
        map2.put(7, "Pink");
        map2.put(8, "Orange");

        System.out.println("Values Of Second Map: " + map2);

        map2.putAll(map1);

        System.out.println("Copy of both the map: " + map2);

    }
}
