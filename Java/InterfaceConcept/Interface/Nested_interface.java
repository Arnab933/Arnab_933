package InterfaceConcept.Interface;

public class Nested_interface {
    public static void main(String[] args) {
        Nested ob = new Nested();
        ob.show();
        // ob.print();//here we can't the call print method because the nested class
        // implement the
        // printable.showable interface not printable interface
    }
}

interface printable {
    void print();

    interface showable {
        void show();
    }
}
//if we try to inplements only the printable intervface then the jdk gets an error because the show method internally
//has the showable interface that's for we have to access the showable interface if we want want to override the show maethod
class Nested implements printable.showable {
    public void show() {
        System.out.println("I am in nested interface on show method");
    }
}
