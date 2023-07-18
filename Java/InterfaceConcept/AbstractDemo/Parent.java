package InterfaceConcept.AbstractDemo;

public abstract class Parent {
    int age;

    // Parent(int age){
    // this.age=age;
    // System.out.println("My age is "+age);
    // }
    // parent class contains two abstract method means parent class contracts to the
    // son class to implenmtns
    // this two abstract methods and to give its own implementation
    abstract void carrer(String name);

    abstract void partner(String name, int age);

    static void hello() {
        System.out.println("hello!!!");
    }
}
