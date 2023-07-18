package NumberSystem;
import java.util.Scanner;

public class BinaryToDec {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        int a = 0, s = 0;
        while (n != 0) {
            s += (int) Math.pow(2, a++) * (n % 10);
            n /= 10;
        }
        System.out.println(s);
    }
}
