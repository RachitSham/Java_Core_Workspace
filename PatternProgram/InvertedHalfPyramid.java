public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // Outer Loop For Column
        for (int i = n; i >= 1; i--) {

            // Inner Loop For Column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
