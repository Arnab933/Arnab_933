class Area {
  int length, width;

  Area() { // default constructor
    length = 8;
    width = 6;
  }

  Area(int a, int b) { // parameterized constructor
    length = a;
    width = b;
  }

  int rectarea() {
    return (length * width);
  }
}

class Rect1cons {
  public static void main(String args[]) {
    Area ob1 = new Area(10, 15);//create reference for parameterized constructor
    int p = ob1.rectarea();//call parameterized constructor and store in p
    Area ob2 = new Area();//create reference for default constructor
    int q = ob2.rectarea();//call default constructor and store in q
    System.out.println("Area=" + p);
    System.out.println("Area=" + q);
  }
}
