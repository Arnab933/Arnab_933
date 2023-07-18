class SuperKeywordH {
    public static void main(String[] args) {
        Derived1 ob = new Derived1(10, 20);
        ob.show();
    }
}

class Super1 {
    int a;

    Super1(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("I am in super class");
        System.out.println("The value of a is:" + a);
    }
}

class Derived1 extends Super1 {
    int a;

    Derived1(int a, int b) {
        super(b); // use for calling super class constructor
        this.a = a;
    }

    void show() {
        System.out.println("I am in derived class");
        System.out.println("The value of the a+b is:" + (a + super.a));// use for call super class instance varioble
        System.out.println();
        super.show();// use for call super class method
        System.out.println();

    }
}