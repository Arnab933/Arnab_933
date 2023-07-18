package Matrix;
import java.util.Scanner;

public class Matrix_check_Unit {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
         System.out.println("Enter dimension of the matrix:\nEnter the number of the rows:");
         int m=ob.nextInt();
         int[][]mat=new int[m][m];
         System.out.println("Enter elements of the matrix:");
         for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]=ob.nextInt();
            }
         }
         if(check_unit(mat))
         System.out.println("The matrix is an Unit matrix");
         else
         System.out.println("The matrix is not an Unit matrix");
    }
    static  boolean check_unit(int[][]mat){
      for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat.length; j++) {
          if(i==j && mat[i][j]!=1)
          return false;
          else if(i!=j && mat[i][j]!=0)
            return false;
         }
      }
    return true;
    }
}
