package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;
import java.util.Collections;

// 10. Write a Java program to shuffle elements in an array list.

public class ArrayListEx10 {

    public static void main(String[] args) {

        ArrayList<String> list_Strings = new ArrayList<>();

        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original ArrayList:" + list_Strings);

        Collections.shuffle(list_Strings);

        System.out.println("Shuffled ArrayList:" + list_Strings);
    }
}
