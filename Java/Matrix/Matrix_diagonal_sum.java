package Matrix;
import java.util.Scanner;

public class Matrix_diagonal_sum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of the matrix:");
        int r = ob.nextInt();
        int c = ob.nextInt();
        int[][] M = new int[r][c];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j] = ob.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < r; i++) {
            sum += M[i][i];
        }
        System.out.println("Sum of diagonal is:" + sum);
        ob.close();
    }
}
