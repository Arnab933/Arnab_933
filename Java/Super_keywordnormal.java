public class Super_keywordnormal {
    public static void main(String[] args) {
        Child ob = new Child(10, 20);
        ob.show();
    }
}

class Parent {
    int a;

    Parent(int a) {
        this.a = a;
    }

    void show1() {
        System.out.println("the value of a=" + a);
    }
}

class Child extends Parent {
    int b;

    Child(int a, int b) {
        super(a);
        this.b = b;
    }

    void show() {
        super.show1();
        System.out.println("the value of b is:" + b + " the value of a is:" + a + " this is the derived class ");

    }
}
