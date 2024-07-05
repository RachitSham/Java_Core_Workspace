public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // Outer Loop For Row
        for (int i = 1; i <= n; i++) {

            // Inner Loop For Column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

}
