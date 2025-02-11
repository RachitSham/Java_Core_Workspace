// time complexity O(2 power n)

package Recursion;

public class SubsequencesString {
    public static void sequencess(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);

        // to be
        sequencess(str, idx + 1, newString + currchar);

        // not to be
        sequencess(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abcde";
        sequencess(str, 0, "");
    }
}
