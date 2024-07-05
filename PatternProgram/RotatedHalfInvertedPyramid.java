public class RotatedHalfInvertedPyramid {
    public static void main(String[] args) {
        int n = 4;

        // Outer Loop For Column
        for (int i = 1; i <= n; i++) {

            // inner Loop -> Space Print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
