package Array_Workspace.Map_Workspace;

import java.util.HashMap;
import java.util.Map;

//Write a Java program to count the number of key-value (size) mappings in a map.   

public class HashMapExample2 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Harry");
        map.put(102, "Jenny");
        map.put(103, "Marry");
        map.put(104, "Alen");
        map.put(105, "Jack");
        map.put(106, "Jessica");

        System.out.println("The size of the HashMap is : " + map.size());
    }
}
