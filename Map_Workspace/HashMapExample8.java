package Array_Workspace.Map_Workspace;

import java.util.HashMap;

// Write a Java program to test if a map contains a mapping for the specified value.

public class HashMapExample8 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(111, "Ravi");
        map.put(222, "Arjun");
        map.put(333, "Bhairav");
        map.put(444, "Ram");
        map.put(555, "Sundaram");

        System.out.println("Original HashMap: " + map);

        System.out.println("1. Is Value Sundaram exists");
        if (map.containsValue("Sundaram")) {
            System.out.println("Yess !!");
        } else {
            System.out.println("No !!");
        }

        System.out.println("1. Is Value Ram exists");
        if (map.containsValue("Ram")) {
            System.out.println("Yess !!");
        } else {
            System.out.println("No !!");
        }

        System.out.println("1. Is Value Amit exists");
        if (map.containsValue("Amit")) {
            System.out.println("Yess !!");
        } else {
            System.out.println("No !!");
        }
    }
}
