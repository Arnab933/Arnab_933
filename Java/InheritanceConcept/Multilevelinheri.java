public class Multilevelinheri {
    public static void main(String args[]) {
        C ob = new C(2, 3, 4, 5); // create the object of class C because the last derived class it
        // int t = ob.multi3();// call the multi method of class C
        System.out.println("Ans is:" + ob.multi3());// and print it
    }
}

class A { // declare the Super class A //first level
    int a, b;

    A(int a, int b) { // create a constructor of class A
        this.a = a;
        this.b = b;
    }

    int multi1() { // multiply the two variables of class A and returns it
        return (a * b);
    }
}

class B extends A { // create the derived class B of class A //second level
    int c;

    B(int a, int b, int c) {// create a constructor of class B
        super(a, b); // declare super of class B to access two data members of class A
        this.c = c;
    }

    int multi2() { // multiply three variables of class B and returns it
        return (a * b * c);
    }
}

class C extends B {// create the derived class C of class B //third level
    int d;

    C(int a, int b, int c, int d) { // create a constructor of class C
        super(a, b, c);
        this.d = d;
    }

    int multi3() { // multiply four variables of class C and returns it
        return (a * b * c * d);
    }
}
