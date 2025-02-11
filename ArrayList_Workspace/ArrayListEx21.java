package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

//Write a Java program to print all the elements of an ArrayList using the elements' position.

public class ArrayListEx21 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Harry Potter");
        list.add("James Bond");
        list.add("Virat Kholi");
        list.add("Rohit Sharma");
        list.add("Ms Dhoni");

        System.out.println("Original ArrayList:" + list);

        int no_of_elements = list.size();
        for (int index = 0; index < no_of_elements; index++) {
            System.out.println(list.get(index));
        }
    }
}
