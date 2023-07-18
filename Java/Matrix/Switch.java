package Matrix;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String fruit = ob.next();

        
        // if(fruit.equals("mango")){
        //  System.out.println("mango fruit");
        // }
        // if(fruit.equals("apple")){
        //     System.out.println("apple");
        // }
        /*if multiple statements has a program then we have to use switch statement  */

        switch(fruit){
            case "Mango":
            System.out.println("Mango is selected");
            break;
            case "Apple":
            System.out.println("Apple is selected");
            break;
            case "Grapes":
            System.out.println("Grapes is selected");
            break;
            default:
            System.out.println("Please enter a valid fruit");
        }
    }
}
