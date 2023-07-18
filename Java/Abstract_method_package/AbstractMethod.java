package Abstract_method_package;
abstract class Bike {
    abstract void run();
}

class Honda extends Bike {
    void run() {
        System.out.println("Honda runs safely");
    }
}

class Hero extends Bike {
    void run() {
        System.out.println("Hero runs safely");
    }
}

class AbstractMethod {
    public static void main(String[] args) {
        Bike ob = new Honda();
        ob.run();
        Hero ob2 = new Hero();
        ob2.run();
        Bike ob3 = new Hero();
        ob3.run();
        Bike ob4 = new Bike() {
            void run() {
                System.out.println("Initial object");
            }
        };
        ob4.run();
    }
}

