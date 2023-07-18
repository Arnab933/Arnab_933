import java.util.Scanner;

public class Strong_number_krishnamurthy {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int k = n;
        int s = 0;
        while (n != 0) {
            int r = n % 10;
            s += fact(r);
            n /= 10;
        }
        if (s == k)
            System.out.println(k + " is a strong number");
        else
            System.out.println(k + " is not a strong number");
        ob.close();
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

}
