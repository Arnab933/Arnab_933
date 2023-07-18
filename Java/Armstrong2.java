import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ob.nextInt();
        checkArm(n);
        ob.close();
    }

    static void checkArm(int n) {
        int c = (int) Math.log10(n) + 1;
        int s = 0, p = n;
        while (n != 0) {
            s += Math.pow(n % 10, c);
            n /= 10;
        }
        if (s == p)
            System.out.println("The number is an armstrong number");
        else
            System.out.println("The number is not an armstrong numeber");
    }
}
