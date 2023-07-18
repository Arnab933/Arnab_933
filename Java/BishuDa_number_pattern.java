import java.util.Scanner;

public class BishuDa_number_pattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter how many row:");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
        ob.close();
    }
}