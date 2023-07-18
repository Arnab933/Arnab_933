import java.util.Scanner;

public class Number_pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter the row and column:");
        Scanner ob = new Scanner(System.in);
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j % 2 == 0) {
                    for (int k = 1; k <= 1; k++) {
                        System.out.print(1 + " ");
                    }
                } else {
                    for (int l = 1; l <= 1; l++) {
                        System.out.print(0 + " ");
                    }
                }
            }
            System.out.println();
        }
        ob.close();
    }
}
