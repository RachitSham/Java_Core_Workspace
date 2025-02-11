package Array_Workspace.Map_Workspace;

import java.util.HashMap;

public class HashMapExample7 {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(111, "Ravi");
        map.put(222, "Arjun");
        map.put(333, "Bhairav");
        map.put(444, "Ram");
        map.put(555, "Sundaram");

        System.out.println("1. Is key 111 Exists ? ");
        if (map.containsKey(111)) {
            System.out.println("Yess ! - " + map.get(111));
        } else {
            System.out.println("Key dosen't does't exists:- ");
        }

        System.out.println("2. Is key 333 Exists ? ");
        if (map.containsKey(333)) {
            System.out.println("Yess ! - " + map.get(333));
        } else {
            System.out.println("Key dosen't does't exists:- ");
        }

        System.out.println("3. Is key 777 Exists ? ");
        if (map.containsKey(777)) {
            System.out.println("Yess ! - " + map.get(777));
        } else {
            System.out.println("Key dosen't does't exists:- ");
        }
    }
}
