package Abstract_method_package;

public class Main {
    public static void main(String[] args) {
        // Son parent = new Son(23);// reference is Parent type but constructor is Child type means
        // // object is child type
        // System.out.println(Parent.age);
        // parent.carrer();
        // parent.partner();
        // Parent.running();// we can call by using class static method of an abstract class

        Parent parent1 = new Daughter(10);
        System.out.println(parent1.age);
        parent1.carrer();
        parent1.partner();

        // Parent parent = new Parent() {// --->error so we can't create object of an
        // abstract class
        // // @Override
        // void carrer() {
        // System.out.println("oiewioroj");
        // }

    };
}
