package Array_Workspace.Map_Workspace;

import java.util.*;
import java.util.HashMap;

//Write a Java program to create a set view of the mappings contained in a map

public class HashMapExample9 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(111, "Ravi");
        map.put(222, "Arjun");
        map.put(333, "Bhairav");
        map.put(444, "Ram");
        map.put(555, "Sundaram");

        System.out.println("Original HashMap: " + map);
        Set set = map.entrySet();

        System.out.println("Set Values : " + set);
    }
}
