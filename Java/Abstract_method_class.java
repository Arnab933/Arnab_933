class Abstract_method_class {
    public static void main(String[] args) {
        int a = 23;
        System.out.println(a);
    }
    // Abstract class in Java
    // A class which is declared as abstract is known as an abstract class. It can contains
    //  abstract and non-abstract methods. It needs to be extended and implements its
    // method. It cannot be instantiated.

    // Points to Remember
    // An abstract class must be declared with an abstract keyword.
    // It can have abstract and non-abstract methods.
    // It cannot be instantiated.
    // It can have constructors and static methods also.
    // It can have final methods which will force the subclass not to change the
    // body of the method.

    // Abstract Method in Java
    // A method which is declared as abstract and does not have implementation is
    // known as an abstract method.

    // Example of abstract method

    // abstract void printStatus();//no method body and abstract
    // Example of Abstract class that has an abstract method
    // In this example, Bike is an abstract class that contains only one abstract
    // method run. Its implementation is provided by the Honda class.
}

abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        Bike obj = new Honda4();
        obj.run();
    }
}
