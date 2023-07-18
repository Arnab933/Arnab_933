package Abstract_method_package;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void carrer() {
        System.out.println("I am going to be a data scientiest");
    }

    @Override
    void partner() {
        System.out.println("I love india ");
    }
}
