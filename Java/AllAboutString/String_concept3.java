package AllAboutString;
import java.util.*;

public class String_concept3 {
    public static void main(String[] args) {
        String str = "Arnab Pratihar pratihar";
        System.out.println(str.toCharArray()); 
        System.out.println(String.valueOf(str.toCharArray()));
        // out put:arnab pratihar;
        System.out.println(Arrays.toString(str.toCharArray()));
        // out put:[a, r, n, a, b, , p, r, a, t, i, h, a, r]
        System.out.println(str.toLowerCase());
        System.out.println(str);
        System.out.println((str.indexOf('a')));
        System.out.println(str.charAt(0));
        String name=" Arnab ";
        // System.out.println(name.strip());
        // out put:Arnaba
        String str1 = Arrays.toString(str.split(" "));

        char[] data = { 'a', 's' };
        String str2 = new String(data);
        System.out.println(str2);
        System.out.println(str1.split(" ").length);
        System.out.println(str1);
        Character.valueOf('a');
        System.out.println(str.toLowerCase());
        String[]arr={"ariuor","asrfiour"};

        System.out.println();
        String st = "Arnab";
        String st1 = "Pratihar";
        String st2 = " ";
        for (int i = 0; i < st.length(); i++) {
            str2 += st.charAt(i);
        }
        st2 += " ";
        // for (int i = 0; i < str1.length()-1; i++) {
        //     st2 += st1.charAt(i);
        // }
        System.out.println(st2);
    }
}