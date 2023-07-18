import java.util.*;

public class Number_pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter the row:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        ob.close();
    }
}