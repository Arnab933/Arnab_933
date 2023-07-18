package Polymorphism;
import java.util.*;

public class Methodoverriding {

    public static void main(String args[]) {
        Sp ob = new Sp();
        ob.input();
        ob.getdata();
        ob.display();
    }
}

class Ap {
    int a;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();

    }

    void display() {
        System.out.println("No. is:" + a);
    }
}

class Sp extends Ap {
    int b;

    void getdata() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the second number:");
        b = ob.nextInt();

    }

    void display() {
        System.out.println("Number is:" + b);
    }
}
