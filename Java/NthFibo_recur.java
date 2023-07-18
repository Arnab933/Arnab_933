import java.util.Scanner;

public class NthFibo_recur {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(nthFibo(n));
    }

    static int nthFibo(int n) {
        if (n < 2)
            return n;
        return nthFibo(n - 1) + nthFibo(n - 2);
    }
}
