package InterfaceConcept.Interface;

class Main {
    public static void main(String[] args) {
        Multiple_interface_samemethod ob = new Multiple_interface_samemethod();
        ob.show();
    }
}

public class Multiple_interface_samemethod implements Printable, Showable {
    /*
     * As we have explained in the inheritance chapter, multiple inheritance is not
     * supported in the
     * case of class because of ambiguity. However, it is supported in case of an
     * interface because there
     * is no ambiguity. It is because its implementation is provided by the
     * implementation class.
     */

    @Override
    public void show() {
        System.out.println("I am in show");
    }

}

interface Printable {
    void show();
}

interface Showable {
    void show();
}
