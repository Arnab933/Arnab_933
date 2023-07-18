package ExceptionHandling;

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

public class Arnab {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(divide(a, b));
        } catch (MyException m) {
            System.out.println(m);
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new MyException("pls don't divide by zero");
        }
        return a / b;
    }
}