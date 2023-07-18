package Polymorphism;

public class Square extends Shapes {
    void area() {
        System.out.println("Area is a*a");
    }

    public static void ap() {
        System.out.println("I am ap");
    }

}
/*
 * static method can't override because override depends on object but static
 * method can't depends on object
 * hence static method can't override
 */
/*
 * Encapsulation:
 * Wrapping up the implementation of the data memeber & member function
 * Abstraction:
 * Hiding unnecessary details .
 */