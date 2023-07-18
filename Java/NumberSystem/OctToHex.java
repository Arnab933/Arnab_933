package NumberSystem;
import java.util.Scanner;
import java.util.HashMap;

public class OctToHex {
    public static void main(String[] args) {
        System.out.println("Enter the octal number:");
        Scanner ob = new Scanner(System.in);
        long octal = ob.nextLong();
        ob.close();

        int n = (int) octalToDeci(octal);
        System.out.println("The equivalent number of this octal number in hex is:" + (decimalToHex(n)));
    }

    static long octalToDeci(long octal) {
        int c = 0;
        int s = 0;
        while (octal != 0) {
            s += (int) Math.pow(8, c++) * (octal % 10);
            octal /= 10;
        }
        return s;
    }

    static String decimalToHex(int dec) {
        HashMap<Integer, Character> has = new HashMap<>();
        has.put(10, 'A');
        has.put(11, 'B');
        has.put(12, 'C');
        has.put(13, 'D');
        has.put(14, 'E');
        has.put(15, 'F');
        String str = "";
        while (dec != 0) {
            if (dec % 16 >= 10)
                str = has.get(dec % 16) + str;
            else
                str = dec % 16 + str;
            dec /= 16;
        }
        return str;
    }
}