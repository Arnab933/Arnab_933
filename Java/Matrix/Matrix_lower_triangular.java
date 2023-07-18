package Matrix;
import java.util.Scanner;

public class Matrix_lower_triangular {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter dimension of the matrix:\nEnter the number of rows:");
        int m = ob.nextInt();
        int[][] mat = new int[m][m];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = ob.nextInt();
            }
        }
        if (check_lowerTriangular(mat))
            System.out.println("The matrix is an Uppertriangular matrix");
        else
            System.out.println("The matrix is not an Uppertriangular matrix");

        ob.close();
    }

    static boolean check_lowerTriangular(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i < j) {
                    if (mat[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}