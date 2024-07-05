public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;

        // Loop For Upper Half
        for (int i = 1; i <= n; i++) {

            // Loop For Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Loop For Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop\ For Lower Half
        for (int i = n; i >= 1; i--) {

            // Loop For Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Loop For Stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
