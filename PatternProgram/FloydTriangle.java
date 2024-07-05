public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        int Number = 1;

        // Outer Loop For Row
        for (int i = 1; i <= n; i++) {

            // Inner Loop For Column

            for (int j = 1; j <= i; j++) {
                System.out.print(Number + " ");
                Number++;
            }
            System.out.println();
        }
    }
}
