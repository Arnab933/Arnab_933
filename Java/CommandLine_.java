import java.util.Scanner;

public class CommandLine_ {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        int n = Integer.parseInt(args[0]);
        System.out.println("Enter elements:");
        Scanner ob = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = ob.nextInt();
            sum += a;
        }
        System.out.println(sum);
        ob.close();
    }
}