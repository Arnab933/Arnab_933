import java.util.*;

public class PrimeFactor2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ob.nextInt();
        ob.close();

        primefact(n);
    }

    static void primefact(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && isPrime(i))
                System.out.println(i + " ");
        }
    }

    static boolean isPrime(int n) {
        int c = 2;
        while (c * c <= n) {
            if (n % c++ == 0)
                return false;
        }
        return true;
    }
}
