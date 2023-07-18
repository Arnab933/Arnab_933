public class Perfect_squre {
    public static void main(String[] args) {
        int n = 1000000000;
        if (perfect(n))
            System.out.println("The no is perfect");
        else {
            System.out.println("The number is not a perfect number");
        }
    }

    static boolean perfect(int n) {
        if (n == 1)
            return true;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n)
                return true;
        }
        return false;
    }
}
