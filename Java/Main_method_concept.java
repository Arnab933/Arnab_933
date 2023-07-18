public class Main_method_concept {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        Main_method_concept.fun(a, b);

    }

    static void fun(int a, int b) {
        // create an object for---add();---method
        System.out.println(a + b);
        Main_method_concept ob = new Main_method_concept();
        ob.add();
        // ob.add();/* we can't access any non static method without referencing their
        // instance in a static content */
    }

    void add() {
        add2();// here we does't create object of add2() method's but program executed because
               // add2() also
        // the part of main class's

    }

    void add2() {
        System.out.println("Arnab");
    }
}
/*
 * Here the main method is public because when the compiler is coming then if
 * the main class is private then the compiler does't able to enter main method
 * 
 * also static because the compiler at first coming into the main method that
 * time does't created any object of main method that's why the compiler did't
 * able to entire the main
 * method,if the main method is static then the method does't depend on the
 * object so the compiler
 * able to execute the main method
 * 
 * and the main method is void because the main method does't return anything
 *
 * static keyword helps us to create a memory in ram thats for the static
 * method/variable's are does't
 * depends on the object
 * *******A static method only access the static data(variable,method)
 * but we can acess the static method inside the non static method
 */