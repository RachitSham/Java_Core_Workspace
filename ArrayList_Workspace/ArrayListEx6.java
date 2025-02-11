package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// 6. Write a Java program to remove the third element from an array list.

public class ArrayListEx6 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Harry Potter");
        list.add("James Bond");
        list.add("Virat Kholi");
        list.add("Rohit Sharma");
        list.add("Ms Dhoni");
        list.add("Narendra Modi");

        System.out.println("Original ArrayList:" + list);
        list.remove(3);
        list.remove(2);

        System.out.println();

        System.out.println("Removed Element From the Array List:" + list);

    }
}
