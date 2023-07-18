import java.util.*;

public class Armstrong_num {
    public static void main(String[] args) {
        System.out.println("Enter a no:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        boolean ans = isarm(n);
        System.out.println(ans);
        ob.close();
        for (int i = 1; i < 100; i++) {
            if (isarm(i)) {/*
                            * if the return value is true then this statement will be exwcuted otherwise
                            * not
                            */
                System.out.print(i + " ");
            }
        }
    }

    static boolean isarm(int n) {// create a boolean method that returns only for true or false
        int sum = 0;
        int original = n;
        while (n > 0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }
        return sum == original;
        /*
         * here if sum and original value both are equal then this statement returns
         * true otherwise false
         */
    }
}