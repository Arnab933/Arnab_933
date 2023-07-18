package AllAboutString;
public class String_concept {
    /*
     * ---String---
     * string is a sequence of character.
     * In java string is a class that's for we have to write it in capital letter
     */
    public static void main(String args[]) {
        int a = 10;
        /* here int is primitive data type that stores in stack memory */
        int[] arr = { 12, 34 };
        /*
         * but here the reference variable arr stored in stack but points the object
         * {12,34}
         * in heap memory
         */
        String str = "Arnab Pratihar";
        /*
         * here String--->class(data type), str--->reference variable
         * "Arnab Pratihar"--->object
         */
        System.out.println(str);
        /*
         * Similarly here the str is a reference variable that stores in the stack
         * memory
         * but points the object "arnab" in heap memory
         */
        String name = "Debjit";
        String name3 = "Debjit";
        System.out.println(name == name3);
        /* here name and name3 are points the same --"Debjit"--object. */
        String name2 = new String("Debjit");
        System.out.println(name == name2);
        /* here new object is created for new keyword */
        System.out.println(name + " \n" + name2);

        System.out.println("Debjit");
        System.out.println();
        /*
         * Concepts:
         * 1.String pool
         * 2.Immutability
         * 
         * --String pool:
         * String pool is nothing but it is a separate memory structure inside the heap.
         * when we create an object of string then the object is stored in the string
         * pool.The main properties of the string pool is it makes the programs more
         * optimised.
         * If we declare the same object in two times using two indivisual
         * reference variable then in the string pool create one object and points
         * those two reference variable in that object
         * ----Immutability:
         * After declare any object by using an reference we can't modified it for some
         * security reasons.That's is immutability.
         */
        System.out.println(name == name3);
        /*
         * Here the == is a method that checks that two reference's points the same
         * object
         * or not
         */
        System.out.println(name.equals(name2));
        /*
         * here the-----name.equals(name2)----also a method that checks that the value
         * of
         * two objects ara same or not
         */
        System.out.println(name.charAt(0));
        /*
         * here---name.charAt(index)----is a method that prints the nth(index) character
         */
    }
}