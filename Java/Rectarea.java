class Rectangle {
    int length, width; // declaration of variables

    void getdata(int x, int y) { // defination of method
        length = x;
        width = y; // create a class and a method where take two input as length and
    }

    // calculate the area and returned
     int rectarea() {
        int area = length * width;
        return (area);
    }
}

class Rectarea // class with main method
{
    public static void main(String args[]) { // main method
        // int area1;
        // Rectangle rect1 = new Rectangle(); // declare two different reference
        // variable
        // rect1.length = 10; // initialise by inputs
        // rect1.width = 15;
        // area1 = rect1.length * rect1.width;
        // System.out.println("Area=" + area1);

        //
        int area2;
        Rectangle rect2 = new Rectangle();
        rect2.getdata(10, 15); // call getdata method
        area2 = rect2.rectarea(); // call area method
        System.out.println("Area=" + area2);

    }

}
