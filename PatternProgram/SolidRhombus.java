public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        // Outer Loop For Row
        for (int i = 1; i <= n; i++) {

            // To Print Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // To Print Stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
