package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

//Write a Java program to test whether an array list is empty or not.

public class ArrayListEx17 {

    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<>();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");

        System.out.println("Original ArrayList:" + c1);

        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
    }
}
