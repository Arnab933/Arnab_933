
import java.util.*;

public class Linearsearch_string {
    public static void main(String args[]) {
        String str = "Arnab";
        char s = 'a';
        if (search(str, s))
            System.out.println("character founded");
        else
            System.out.println("Character not founded");

        System.out.println(Arrays.toString(str.toCharArray()));

        /*
         * str.toCharArray() ------this method convert a string into an caracter array
         * for this reason we have to store this array in a character type
         * of array and then we printed it or also we can direct print it by
         * using---toString
         * method
         */
        if (Search(str, s))
            System.out.println("character founded");
        else
            System.out.println("Character not founded");
    }

    static boolean search(String str, char a) {
        for (int i = 0; i < str.length(); i++) {
            /* for find the length of a string we used a method that is-- str.length(); */
            if (str.charAt(i) == a)
                return true;
        }
        return false;
    }

    static boolean Search(String str, char a) {
        if (str.length() == 0)
            return false;
        for (char ch : str.toCharArray()) {
            /*
             * Enhanced for loop where the String str--convert into a char array by using
             * str.toChararray(); and then check every index to similar as the Enhanced for
             * loop
             * works
             */
            if (ch == a) {
                return true;
            }
        }
        return false;
    }
}