package NumberPattern;
import java.util.*;
public class Number_pattern8 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value of the row and coloumn:");
        int row = ob.nextInt();
        int col = ob.nextInt();
        for (int i = 1; i <= row; i++) {
            if (i % 2 == 0) {
                for (int k = 1; k <= 1; k++) {
                    for (int j = 1; j <= col; j++) {
                        if (j % 2 == 0)
                            System.out.print(1);
                        else {
                            System.out.print(0);
                        }
                    }

                }
                System.out.println();
            } else {
                for (int l = 1; l <= 1; l++) {
                    for (int m = 1; m <= col; m++) {
                        if (m % 2 == 0)
                            System.out.print(0);
                        else {
                            System.out.print(1);
                        }
                    }

                }
                System.out.println();

            }

        }
        ob.close();
    }
}
