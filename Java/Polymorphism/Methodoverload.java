package Polymorphism;
class Methodoverload {
    public static void main(String args[]) {
        Method ob1 = new Method(5.0, 2.0);
        double r = ob1.area();
        System.out.println("Area=" + r);
        Method ob2 = new Method(10.0);
        double r1 = ob2.area();
        System.out.println("Area=" + r1);
    }
}

class Method {
    double length, breadth;

    Method(double a, double b) { // create
        length = a;
        breadth = b;
    }

    Method(double a) {
        length = breadth = a;
    }

    double area() {
        return (length * breadth);
    }
}