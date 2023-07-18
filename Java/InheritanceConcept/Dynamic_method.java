class Base {
    public void method() {
        System.out.println("I am in class Base");
    }
}

class Derived extends Base {
    public void method() {
        System.out.println("I am in class Derived");
    }
}

class Dynamic_method {
    public static void main(String args[]) {
        Base ob = new Derived();
        ob.method();
    }
}