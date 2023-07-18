package InterfaceConcept.Interface;

public class Multiple_interface {
    public static void main(String[] args) {
        // Showable ob=new Draw();
        // ob.show();
        // ob.print();//here gets an error because the show method has in the Showable
        // interface but print method
        // has in the Printable interface
        Draw ob = new Draw();
        ob.print();
        ob.show();
    }
}

interface Showable {
    void show();
}

interface Printable {
    void print();
}

class Draw implements Showable, Printable {

    @Override
    public void print() {
        System.out.println("I print my pic");
    }

    @Override
    public void show() {
        System.out.println("I show my pic ");
    }

}