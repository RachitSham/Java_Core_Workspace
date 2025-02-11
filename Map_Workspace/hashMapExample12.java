package Array_Workspace.Map_Workspace;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class hashMapExample12 {

    public static void main(String[] args) {

        HashMap<Integer, String> hash_map = new HashMap<>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        System.out.println("Collection Value is: " + hash_map.values());
    }
}
