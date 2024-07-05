public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;

        // Outer Loop for Row
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 1st Half Numbers
            for (int j = i; j >= 1; j--) {
                System.err.print(j);
            }

            // 2nd half Numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
