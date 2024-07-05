public class SolidRectangle {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        // Outer Loop For Row
        for (int i = 1; i <= m; i++) {

            // Inner Loop For Column
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
