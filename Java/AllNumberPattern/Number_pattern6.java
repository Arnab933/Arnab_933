import java.util.Scanner;

public class Number_pattern6 {
    public static void main(String[] args) {
        System.out.println("Enter the value of row and col:");
        Scanner ob = new Scanner(System.in);
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if ((i == 1 || i == row || j == 1 || j == col))
                    System.out.print(1);
                else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        ob.close();
    }
}
