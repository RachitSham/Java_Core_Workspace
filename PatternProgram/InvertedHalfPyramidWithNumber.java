public class InvertedHalfPyramidWithNumber {
    public static void main(String[] args) {
        int n = 5;

        // Inner Loop For Row
        for (int i = n; i >= 1; i--) {

            // Outer loop For Column
            for (int j = 1; j <= i; j++) {
                // for(int j = 1; j <= n-i+1; j++) this logic also valid.
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
