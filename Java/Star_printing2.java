import java.util.Scanner;

public class Star_printing2 {
    public static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
            ob.close();
        }

    }
}