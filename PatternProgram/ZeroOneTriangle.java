public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;

        // Outer Loop For Row
        for (int i = 1; i <= n; i++) {

            // Inner Loop For Column
            for (int j = 1; j <= i; j++) {
                int sum = i + j;

                if ((sum % 2 == 0)) {
                    // If Even Then Print 1
                    System.out.print("1 ");
                } else {
                    // If Odd Then Print Odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
