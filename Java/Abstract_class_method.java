class Abstract_class_method {

    /*
     * Abstract class in Java
     * A class which is declared as abstract is known as an abstract class. It can
     * have abstract and non-abstract methods. It needs to be extended and its
     * method implemented. It cannot be instantiated.
     * 
     * Points to Remember
     * An abstract class must be declared with an abstract keyword.
     * It can have abstract and non-abstract methods.
     * It cannot be instantiated.
     * It can have constructors and static methods also.
     * It can have final methods which will force the subclass not to change the
     * body of the method.
     */
    /*
     * Abstract Method in Java
     * A method which is declared as abstract and does not have implementation is
     * known as an abstract method.
     * 
     * Example of abstract method
     * 
     * abstract void printStatus();//no method body and abstract
     * Example of Abstract class that has an abstract method
     * In this example, Bike is an abstract class that contains only one abstract
     * method run.
     * Its implementation is provided by the Honda class.
     */
}

// abstract class Bike{
// abstract void run();
// }
// class Honda4 extends Bike{
// void run(){System.out.println("running safely");}
// public static void main(String args[]){
// Bike obj = new Honda4();
// obj.run();
// }
// }
/*
 * Abstract class having constructor, data member and methods
 * An abstract class can have a data member, abstract method, method body
 * (non-abstract method), constructor, and even main() method.
 * 
 */
// Example of an abstract class that has abstract and non-abstract methods
abstract class Bike1 {
    Bike1() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");

    }
}

// Creating a Child class which inherits Abstract class
class Honda2 extends Bike1 {
    void run() {
        System.out.println("running safely..");
    }
}

// Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2 {
    public static void main(String args[]) {
        Bike1 obj = new Honda2();
        obj.run();
        obj.changeGear();
    }
}
