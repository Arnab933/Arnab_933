package RecursionConcept;
public class Recursion_intro {
    public static void main(String[] args) {
        /*
         * print numbers write a function that takes in a numbers and prints it
         * print first 5 numbers:1 2 3 4 5
         */
        print(1);
    }

    /*
     * while the function is not finished executing it will ramain in stack
     * when a function finished executing it is removed from the stack and the flow
     * of program is restored
     * to where that the function is called
     */
    static void print(int n) {
        System.out.println(n);
        if (n < 5) // base condition
            print(n + 1);
    }

}
/* recursion:when a function calls itself */
/*
 * At first the main function going to print(1) then main function called the
 * same function with argument 2
 * and then the argument 2 function called again same function with argument 3
 * and so on,at last called the
 * same function with argument 5.then the base case failed then the program will
 * be terminated.
 * Base condition:
 * when any function will be called from another function then that function get
 * a separate
 * memory in the stack.Base condition is a condition where recursion will stop
 * making new condition.If any error has in
 * the base condition then the program will never terminated,then the stack
 * filled again and again its called
 * stack overflow.
 * It helps us in solving bigger/complex problems in a simple way.
 * you can convert recursion solution into iteration & vise-versa.
 * first solve any problems in recursion and then it convert into iteration for
 * getting more optimised answer.
 * 
 * here space complexity is not constant because function calling again and
 * again.
 * 
 * Visualising recursion:(VVVVII) Recursive tree::::
 * program start --->print(1)-> print(2)-> print(3)-> print(4)->print(5)
 * -----then
 * program over<---- print(1)<-print(2)<-print(3)<-print(4)<-print(5)
 * 
 */