package InterfaceConcept.InterfaceCar;

public class Main {
    public static void main(String[] args) {
        Engine ob = new Car();
        ob.start();
        ob.stop();
        ob.acc();
        // ob.brake();



        Media ob1 = new Car();
        ob1.start();
        ob1.stop();
        // System.out.println(Engine.PRICE);
    }
}
