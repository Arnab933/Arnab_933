import java.util.Scanner;

public class Number_pattern9 {
    public static void main(String[] args) {
        System.out.println("Enter value of the row and column:");
        Scanner ob = new Scanner(System.in);
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col)
                    System.out.print("@");
                else if (i == 2 || i == row - 1 || j == 2 || j == col - 1)
                    System.out.print("-");
                else if (i == 3 || i == row - 2 || j == 3 || j == col - 2)
                    System.out.print("+");
                else if (i == 4 || i == row - 3 || j == 4 || j == col - 3)
                    System.out.print("*");
                else if (i == 5 || i == row - 4 || j == 5 || j == col - 4)
                    System.out.print("$");

            }
            System.out.println();
        }
        ob.close();
    }
}
