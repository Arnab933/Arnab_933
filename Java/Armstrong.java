import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        int m = n;
        int c = 0;
        while (n != 0) {
            c++;
            n = n / 10;

        }
        System.out.println(c);
        double s = 0;
        int p = m;
        int r = 0;
        while (m != 0) {
            r = n % 10;
            s = s + (Math.pow(r, c));
            m = m / 10;
        }
        System.out.println((int) s);
        if ((int) s == p)
            System.out.println("the no. is a armstrong number");
        else
            System.out.println("the number is not a armstrong no.");
        ob.close();
    }
}
