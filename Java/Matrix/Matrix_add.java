package Matrix;
// import java.util.Arrays;
import java.util.Scanner;

public class Matrix_add {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size of the first matrix:");
        int r1 = ob.nextInt();
        int c1 = ob.nextInt();
        int[][] M1 = new int[r1][c1];
        System.out.println("Enter size of the second matrix:");
        int r2 = ob.nextInt();
        int c2 = ob.nextInt();
        int[][] M2 = new int[r2][c2];

        if (r1 == r2 && c1 == c2) {
            int[][] M3 = new int[r1][c1];
            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    M1[i][j] = ob.nextInt();
                }
            }
            System.out.println("Enter elements of the second matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    M2[i][j] = ob.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    M3[i][j] = M1[i][j] + M2[i][j];
                }
            }
            System.out.println("The resultant matrix is:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(M3[i][j] + " ");
                }
                System.out.println();
            }
         
        } else
            System.out.println("Matrix addition is not possible");
        ob.close();
    }
}
