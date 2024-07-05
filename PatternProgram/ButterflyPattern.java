public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;

        // Outer Loop For Row Upper Half
        for (int i = 1; i <= n; i++) {

            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Loop For Spaces
            int Spaces = 2 * (n - i);
            for (int j = 1; j <= Spaces; j++) {
                System.out.print(" ");
            }

            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Outer Loop For Row Lower Half
        for (int i = n; i >= 1; i--) {

            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Loop For Spaces
            int Spaces = 2 * (n - i);
            for (int j = 1; j <= Spaces; j++) {
                System.out.print(" ");
            }

            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
