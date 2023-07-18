class Hero {
    int length, breadth;

    Hero(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return (length * breadth);
    }
}

class Singleinheri extends Hero {
    int height;

    Singleinheri(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;

    }

    int volume() {
        return (length * breadth * height);
    }
}

class Final {
    public static void main(String args[]) {
        Singleinheri room1 = new Singleinheri(10, 20, 30);
        System.out.println("Area=" + room1.area());
        System.out.println("Volume=" + room1.volume());
    }
}