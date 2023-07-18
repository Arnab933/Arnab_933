package RecursionConcept;
import java.util.Scanner;

public class LongestPrefixUsingRecursion {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the sentance");
        String str = ob.nextLine();
        System.out.println("The common prefix is:" + FindPrefix(str));
        ob.close();
    }

    static String FindPrefix(String str) {
        String[] arr = str.split(" ");
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
