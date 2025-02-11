package Array_Workspace.ArrayList_Workspace;

//  Write a Java program to increase an array list size.
import java.util.*;;

public class ArrayListEx19 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Harry Potter");
        list.add("James Bond");
        list.add("Virat Kholi");
        list.add("Rohit Sharma");
        list.add("Ms Dhoni");
        list.add("Narendra Modi");

        System.out.println("Original ArrayList:" + list);

        list.ensureCapacity(3);
        list.add("Jerry Wilson");
        list.add("Frank MacDonald");
        list.add("Tommy Wilson");

        System.out.println("ArrayList Capacity Increase:" + list);

    }
}
