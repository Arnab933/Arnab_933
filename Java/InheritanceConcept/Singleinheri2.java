import java.util.Scanner;

public class Singleinheri2 {
    public static void main(String args[]) {
        B ob = new B();
        ob.input();
        ob.getdata();
        ob.add1();
        ob.add2();
    }
}

class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        sc.close();
    }

    void add1() {
        System.out.println("Addition=" + (a + b));
    }
}

class B extends A {
    int c;

    void getdata() {
        System.out.println("Enter the third number:");
        Scanner ap = new Scanner(System.in);
        c = ap.nextInt();
        ap.close();
    }

    void add2() {
        System.out.println("Addition2:" + (a + b + c));
    }
}