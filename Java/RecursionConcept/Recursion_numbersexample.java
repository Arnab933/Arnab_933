package RecursionConcept;
public class Recursion_numbersexample {
    public static void main(String[] args) {
        /*
         * print numbers write a function that takes in a numbers and prints it
         * print first 5 numbers:1 2 3 4 5
         */
        print1(1);
    }

    /*
     * while the function is not finished executing it will ramain in stack
     * when a function finished executing it is removed from the stack and the flow
     * of program is restored
     * to where that the function is called
     */
    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    /* function body will be change */
    static void print5(int n) {
        System.out.println(n);
    }
}