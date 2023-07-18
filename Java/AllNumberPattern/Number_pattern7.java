import java.util.Scanner;

public class Number_pattern7 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value of the row and coloumn:");
        int row = ob.nextInt();
        int col = ob.nextInt();
        if (row == col) {
            if (row % 2 != 0) {
                int m = row / 2 + 1;
                for (int i = 1; i <= row; i++) {
                    for (int j = 1; j <= col; j++) {
                        if (i == m & j == m)
                            System.out.print(0 + " ");
                        else {
                            System.out.print(1 + " ");
                        }
                    }
                    System.out.println();
                }
                ob.close();
            }
        } else {
            System.out.println("Please enter the valid row and column");
        }
    }
}
