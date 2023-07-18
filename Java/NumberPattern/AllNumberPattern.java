package NumberPattern;

public class AllNumberPattern {
    public static void main(String[] args) {
        square0to8(2);
        // square1To5(4);
        // diamond(5);
    }

    static void square1To5(int n) {
        int originalValue = n;
        n = 2 * n - 2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int value = originalValue - Math.min(Math.min(row, col), Math.min(n - col, n - row));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void square0to8(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int value = Math.min(Math.min(row, col), Math.min(n - col, n - row));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void diamond(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalCol = row > n ? (2 * n - row) : row;
            int space = n - totalCol;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int col = totalCol; col >= 1; col--) {
                System.out.print(col);
            }
            for (int l = 2; l <= totalCol; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
