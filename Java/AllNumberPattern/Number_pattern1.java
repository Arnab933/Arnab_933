import java.util.Scanner;

public class Number_pattern1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the row and coloumn:");
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        ob.close();
    }
}
