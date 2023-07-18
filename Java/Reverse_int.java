public class Reverse_int {
    public static void main(String args[]) {
        int n = 90000;
        System.out.println(reverse(n));

    }

    public static int reverse(int n) {
        int s = 0;
        if (n > -Math.pow(2, 31) && n < (Math.pow(2, 31) - 1)) {
            for (int i = n; n != 0;) {
                int r = n % 10;
                s = s * 10 + r;
                n = n / 10;
            }
            return s;
        } else
            return 0;
    }
}
