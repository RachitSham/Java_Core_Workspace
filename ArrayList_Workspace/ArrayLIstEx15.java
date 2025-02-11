package Array_Workspace.ArrayList_Workspace;

import java.util.ArrayList;

//Write a Java program to clone an array list to another array list.

public class ArrayLIstEx15 {

    public static void main(String[] args) {

        ArrayList<String> list_Strings = new ArrayList<>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println("Original ArrayList:" + list_Strings);

        ArrayList<String> cloneList = (ArrayList<String>) list_Strings.clone();

        System.out.println("Cloned Array List:" + cloneList);
    }
}
