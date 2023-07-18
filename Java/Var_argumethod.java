import java.util.Arrays;

public class Var_argumethod {
    public static void main(String args[]) {
        m();// no arguments
        m("arnab");// string arguments
        multiple(12, 34, 56, "Arnab");/// integer & string arguments
    }

    static void m(String... a) {// method for string arguments
        System.out.println("the length is:" + a.length + " " + a);
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, int c, String d) {// integer and string arguments
        System.out.println(a + " " + b + " " + c + " " + d + " ");
    }
}
// internally these variables are indivisually array,thats why we can find the
// length of these variable's.