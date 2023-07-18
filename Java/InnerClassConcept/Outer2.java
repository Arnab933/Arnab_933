package InnerClassConcept;

class Concept2 {
    class Inner2 {
        String name;

        Inner2(String name) {
            this.name = name;
        }
    }
}

public class Outer2 {
    public static void main(String[] args) {
        Concept2 ob1 = new Concept2();// here ob1 is the object of the outer class Concept2.
        // for create the inner class object we must have to create the outer class
        // object because the inner class depends on the outer class
        Concept2.Inner2 ob2 = ob1.new Inner2("Sujit");
        System.out.println(ob2.name);
        Concept2.Inner2 ob3 = new Concept2().new Inner2("Arnab");
        System.out.println(ob3.name);
    }

}
