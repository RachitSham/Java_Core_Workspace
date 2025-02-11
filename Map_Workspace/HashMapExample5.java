package Array_Workspace.Map_Workspace;

import java.util.HashMap;

// Write a Java program to check whether a map contains key-value mappings (empty) or not

public class HashMapExample5 {

    public static void main(String[] args) {

        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(1, "Margaret");
        hMap.put(2, "Jessica");
        hMap.put(3, "Jasmin");
        hMap.put(4, "Rubicaa");
        hMap.put(5, "Sophia");

        System.out.println("Original HashMap: " + hMap);

        boolean result = hMap.isEmpty();

        System.out.println("Hash Map is Empty: " + result);

        hMap.clear();
        result = hMap.isEmpty();

        System.out.println("Is Hash Map Empty: " + result);
    }
}
