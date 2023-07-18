package InterfaceConcept.AbstractDemo;

public class Son extends Parent {

  int age;

  Son(int age) {
    // super(age);
    this.age=age;
  }

  @Override
  void carrer(String name) {
    System.out.println("I am going to be a " + name);
  }

  @Override
  void partner(String name, int age) {
    System.out.println("My partner's name is " + name + " and age is " + age + "yrs");
  }
}
