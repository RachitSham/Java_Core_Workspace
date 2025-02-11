package Array_Workspace.ArrayList_Workspace;

import java.util.*;;

//Write a Java program to compare two array lists.

public class ArrayListEx13 {

    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("A");
        c2.add("B");
        c2.add("C");
        c2.add("D");

        ArrayList<String> c3 = new ArrayList<>();

        for (String e : c1) {
            c3.add(c2.contains(e) ? "Yes" : "No");
            System.out.println(c3);
        }

    }
}
