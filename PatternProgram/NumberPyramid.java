public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Loops For Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Loops For To Print The Numbers
            for (int j = 1; j <= i; j++) {
                System.err.print(i + " ");
            }
            System.out.println();
        }
    }
}
