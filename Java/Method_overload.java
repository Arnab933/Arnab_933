import java.util.Arrays;

public class Method_overload {
    public static void main(String[] args) {
        Method_overload.sum(12, 23);
        Method_overload.sum(12, 23, 12);
        Method_overload.sum(12.00, 14.00);
        Method_overload.sum(12, 2, 2, 3, 5, 6, 7, 8, 89, 9);
        Method_overload.sum(10.2, 12.9, 12.0, 23.46);

    }

    static void sum(int a, int b) {// create a void return type static method
        System.out.println(a + b);
    }

    static void sum(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    static void sum(double a, double b) {
        System.out.println(a * b);
    }

    static void sum(int... a) {// create a void return type static var_args method
        System.out.println(Arrays.toString(a));// display the array by using [toString] method
    }

    static void sum(double... a) {
        System.out.println(Arrays.toString(a));
    }

}