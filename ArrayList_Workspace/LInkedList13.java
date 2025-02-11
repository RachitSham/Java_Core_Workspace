package Array_Workspace.ArrayList_Workspace;

import java.util.LinkedList;

/**
 * LInkedL
 * ist13

 */

/**
 * LInkedList13
 */
public class LInkedList13 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();
        linked.add("Red");
        linked.add("Blue");
        linked.add("Green");
        linked.add("Yellow");
        linked.add("Orange");

        System.out.println("Remove First : " + linked.removeFirst());

        System.out.println("Remove Last : " + linked.getLast());

        System.out.println("New LinkedList : " + linked);
    }

}