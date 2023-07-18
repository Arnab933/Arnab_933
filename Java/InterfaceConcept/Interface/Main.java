package InterfaceConcept.Interface;

interface Big1 {
    void big1();

    public static int method(int a) {
        // we can create any static method because static method does not depends on the
        // object
        return a * a * a;
    }
}

interface Big2 extends Big1 {// here interface Big2 extends the Big1 interface
    void big2();
}

class Interface_inheritance implements Big2 {// here Interface_inheritance implements the Big2 interface

    @Override
    public void big2() {
        System.out.println("I am in big2");
    }

    @Override
    public void big1() {
        System.out.println("I am in big1");
    }
}

public class Main {
    public static void main(String[] args) {
        Interface_inheritance ob = new Interface_inheritance();
        ob.big1();
        ob.big2();
        System.out.println(Big1.method(3));

    }

}