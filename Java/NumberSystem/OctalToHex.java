package NumberSystem;
import java.util.*;

public class OctalToHex {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the octal number:");
        long n = ob.nextLong();
        ob.close();

        int decimal = octToDec(n);
        decimalToHex(decimal);
    }

    static int octToDec(long octal) {
        int s = 0;
        int c = 0;
        while (octal != 0) {
            s += Math.pow(8, c++) * (int) (octal % 10);
            octal /= 10;
        }
        return s;
    }

    static void decimalToHex(int n) {
        String str = "";
        HashMap<Integer, Character> has = new HashMap<>();
        has.put(10, 'A');
        has.put(11, 'B');
        has.put(12, 'C');
        has.put(13, 'D');
        has.put(14, 'E');
        has.put(15, 'F');
        while (n != 0) {
            if (n % 16 >= 10)

                str = has.get(n % 16) + str;

            else

                str = n % 16 + str;
            n /= 16;

        }
        System.out.println("The equivalent number of this number in hex is:" + str);
    }
}
