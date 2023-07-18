import java.util.*;

public class Number_pattern4_pro {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the row and column:");
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= 1; j++) {
                if (i % 2 == 0) {
                    for (int k = 1; k <= col; k++) {
                        System.out.print(0);
                    }
                } else {
                    for (int l = 1; l <= col; l++) {
                        System.out.print(1);
                    }
                }
            }
            System.out.println();
        }
        ob.close();

    }
}