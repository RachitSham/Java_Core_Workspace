package Array_Workspace.Map_Workspace;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapAllFunctions {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(208012, "Kanpur");
        map.put(208014, "Lucknow");
        map.put(208387, "Agra");
        map.put(206783, "Mumbai");

        System.out.println(map);

        map.put(208090, "China");
        System.out.println(map);

        // Search

        // if (map.containsKey(208322)) {
        // System.out.println("Key is Present in the Map: ");
        // } else {
        // System.out.println("Key is not Present in the Map: ");

        // }

        // System.out.println(map.get(208014));// Key Exists

        // System.out.println(map.get(208013));// Key doesn't exists

        // int[] arr = { 10, 30, 54, 89, 98, };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for (int value : arr) {
        // System.out.println(" arr: " + value);

        // Iterator 1
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> Keys = map.keySet();
        for (String key : Keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("Agra");
        System.out.println(map);
    }
}
