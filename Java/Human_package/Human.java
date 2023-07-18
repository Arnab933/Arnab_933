package Human_package;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    public int population;

    public Human(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        this.population += 1;
    }
}
