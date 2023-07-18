import java.util.*;

public class Largest_word {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        largest_word(str);
        ob.close();
    }

    static void largest_word(String str) {
        String[] str1 = str.split(" ");
        int big = str1[0].length();
        String Big = str1[0];
        for (int i = 1; i < str1.length; i++) {
            if (str1[i].length() > big) {
                big = str1[i].length();
                Big = str1[i];
            }
        }
        System.out.println("The largest word is :" + Big + " and length is:" + big);
    }
}
