public class Arr_var_args {
    static void fun(int... a) {
        System.out.print("No of arguments:" + a.length);
        for (int i : a)
            System.out.print(" " + i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        fun(10);
        fun(23, 34);
        fun(12, 12, 23);
        fun();
    }
}
