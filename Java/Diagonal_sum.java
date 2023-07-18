import java.util.Scanner;

public class Diagonal_sum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter size of the array:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int n1 = ob.nextInt();
        ob.close();
        int[][] arr = new int[n][n1];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ob.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int j = arr.length - 1 - i;
            if (i == j) {
                sum += arr[i][j];
            } else {
                sum += arr[i][i];
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
