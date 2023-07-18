import java.util.Scanner;


public class Number_pattern4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the row and column:");
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i % 2 == 0)
                    System.out.print(0);
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
        ob.close();
    }
}
