
class Rectangle1 {
    int length, breadth;

    Rectangle1(int a, int b) {
        length = a;
        breadth = b;
    }

    int area() {
        return (length * breadth);
    }
}

class Rectanglecons {
    public static void main(String args[]) {
        Rectangle1 rect1 = new Rectangle1(10, 20);
        int p = rect1.area();
        System.out.println("Area=" + p);
    }
}