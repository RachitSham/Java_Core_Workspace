//Check if an array is sorted (strictly increasing). - O(n)

package Recursion;

public class ArraySorted {

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {

            // Array is Shorted Till Now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 9 };
        System.out.println(isSorted(arr, 0));
    }
}
