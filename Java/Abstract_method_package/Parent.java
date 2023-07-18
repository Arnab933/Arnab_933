package Abstract_method_package;

public abstract class Parent {
    static int age;
    final int ab = 90;

    public Parent(int age) { // so we can create constractor of an abstract class
        this.age = age;
        System.out.println(this.age);
    }

    /*
     * Java constructor can not be final:
     * One of the important property of java constructor is that it can not be
     * final. As we know, constructors are
     * not inherited in java. Therefore, constructors are not subject to hiding or
     * overriding. When there is no
     * chance of constructor overriding, there is no chance of modification also.
     * When there is no chance of
     * modification, then no sense of restricting modification there. We know that
     * the final keyword restricts
     * further modification. So a java constructor can not be final because it
     * inherently it cannot be modified.
     * Also, a java constructor is internally final. So again there is no need for
     * final declaration further.
     */
    /*
     * Java constructor can not be static:
     * One of the important property of java constructor is that it can not be
     * static. We know static keyword
     * belongs to a class rather than the object of a class. A constructor is called
     * when an object of a class
     * is created, so no use of the static constructor. Another thing is that if we
     * will declare static constructor
     * then we can not access/call the constructor from a subclass. Because we know
     * static is allowed within a
     * class but not by a subclass.
     */
    static void running() {
        System.out.println("I runs daily");
    }

    abstract void carrer();

    abstract void partner();
}
/*----abstract void method_name(argument list);   no curly braces
 * there are no implementation provide in the parent class only declaration and the child class must override 
 * them.The parent's class does't have any body.Any class can contain many abstract method.But an abstract
 * class can contain only abstract method 
We can't  create  abstract constractor because a constractor creates  object  but we can't 
created any object of an abstract method.
 */