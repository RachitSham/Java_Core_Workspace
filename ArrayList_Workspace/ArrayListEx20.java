package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

// Write a Java program to replace the second element of an ArrayList with the specified element.

public class ArrayListEx20 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Harry Potter");
        list.add("James Bond");
        list.add("Virat Kholi");
        list.add("Rohit Sharma");
        list.add("Ms Dhoni");

        System.out.println("Original ArrayList:" + list);

        String name = "David Warner";
        list.set(1, name);

        int num = list.size();
        System.out.println("Replace second element with 'David Warner'.");
        for (int i = 0; i < num; i++) {
            System.out.println(list.get(i));
        }
    }
}
