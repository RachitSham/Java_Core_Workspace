package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

//5. Write a Java program to update an array element by the given element.

public class ArrayListEx5 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Harry Potter");
        list.add("James Bond");
        list.add("Virat Kholi");
        list.add("Rohit Sharma");
        list.add("Ms Dhoni");

        System.out.println("Original ArrayList: " + list);

        list.set(0, "Narendra Modi");
        list.set(3, "Ritik Roshan");

        System.out.println("Updated ArrayList: " + list);

    }
}
