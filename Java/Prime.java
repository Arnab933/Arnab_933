import java.util.*;

public class Prime {
    public static void main(String[] args) {
        int n;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime ");
    }

    public static boolean IsPrime(int n) {
        if (n <= 1)
            return false;
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0)
                return false;
            c++;
        }
        return true;
    }
}
