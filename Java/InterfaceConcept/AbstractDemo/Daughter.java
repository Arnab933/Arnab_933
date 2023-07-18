package InterfaceConcept.AbstractDemo;

public class Daughter extends Parent {
  int age;

  Daughter(int age) {
    // super(age);
    this.age = age;
  }

  @Override
  void carrer(String name) {
    System.out.println("I an going to be a " + name);
  }

  @Override
  void partner(String name, int age) {
    System.out.println("My partners name is: " + name + " and age is: " + age + "yrs");
  }

}
