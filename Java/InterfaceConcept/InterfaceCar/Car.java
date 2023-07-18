package InterfaceConcept.InterfaceCar;

public class Car implements Engine, Media {
    // int a = 30;// we can't call this type instance variable in main method

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I acc like a normal car");
    }

    // @Override
    // public void brake() {
    // System.out.println("I brake like a normal car");
    // }

}
