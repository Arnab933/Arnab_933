package Abstract_method_package;

public class Son extends Parent {
    public Son(int age) {
        super(age);
        System.out.println(this.age);
    }

    @Override
    void carrer() {
        System.out.println("I am going to be a Software Engineer");
    }

    @Override
    void partner() {
        System.out.println("I love myself ");
    }
}