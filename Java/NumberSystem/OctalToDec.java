package NumberSystem;
import java.util.Scanner;

public class OctalToDec {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        int s = 0, a = 0;
        while (n != 0) {
            s += (int) Math.pow(8, a++) * (n % 10);
            n /= 10;
        }
        System.out.println(s);
    }
}
