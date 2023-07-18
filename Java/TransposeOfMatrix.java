import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        System.out.println("Enter dimension of the matrix:\nEnter the row:");
        Scanner ob = new Scanner(System.in);
        int m = ob.nextInt();
        System.out.println("Enter the columns:");
        int n = ob.nextInt();
        int[][] M1 = new int[m][n];
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) {
                M1[i][j] = ob.nextInt();
            }
        }
        ob.close();
        System.out.println("The transpose matrix of this matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(M1[j][i] + " ");
            }
            System.out.println();
        }
    }
}