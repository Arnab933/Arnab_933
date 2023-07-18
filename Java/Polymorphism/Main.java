package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        Circle2 circle2 = new Circle2();
        Shapes square = new Square();// here we create a reference of the type of parent class
        Triangle triangle = new Triangle();
        circle2.area();
        triangle.area();
        square.area();

        /*
         * we can create an object of parent class type but which method is called
         * depends on the child class
         * Parent obj=new Child();------it's called Upcasting
         */
    }
}