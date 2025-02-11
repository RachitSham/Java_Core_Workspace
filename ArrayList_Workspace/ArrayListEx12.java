package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to extract a portion of an array list.

public class ArrayListEx12 {

    public static void main(String[] args) {

        List<String> List = new ArrayList<String>();
        List.add("A");
        List.add("B");
        List.add("C");
        List.add("D");
        List.add("E");
        List.add("F");

        System.out.println("Original ArrayList:" + List);

        List<String> sub_List = List.subList(0, 3);

        System.out.println("List ofd the first three Element:" + sub_List);
    }
}
