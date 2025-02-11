package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//11. Write a Java program to reverse elements in an array list.

public class ArrayListEx11 {
    public static void main(String[] args) {

        List<String> List = new ArrayList<String>();
        List.add("A");
        List.add("B");
        List.add("C");
        List.add("D");

        System.out.println("Original ArrayList:" + List);

        Collections.reverse(List);

        System.out.println("Reverse ArrayList:" + List);
    }
}
