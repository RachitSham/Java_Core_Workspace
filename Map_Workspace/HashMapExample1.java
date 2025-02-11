package Array_Workspace.Map_Workspace;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to associate the specified value with the specified key in a HashMap.

public class HashMapExample1 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(111, "Ravi");
        map.put(222, "Arjun");
        map.put(333, "Bhairav");
        map.put(444, "Ram");

        System.out.println("The Size of the HashMap: " + map.size());

        for (Map.Entry x : map.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
