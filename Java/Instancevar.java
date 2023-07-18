
class Instancevar {
    static String name = "Arnab Pratihar"; // Declared Instance Variable

    Instancevar() { // Default Constructor

        name = "Arnab Pratihar";// initializing Instance Variable
    }

    public static void main(String[] args) // Main Method
    {
        int a = 10;// declared a local variable
        // Instancevar AP = new Instancevar(); // Object Creation
        System.out.println("Ap means:" + name); // Displaying O/P
        System.out.println("local variable:" + a);
    }
}