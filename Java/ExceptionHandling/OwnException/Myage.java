package OwnException;

import java.util.Scanner;


public class Myage {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter the age:");
            int n = ob.nextInt();
            try {
                System.out.println(inputAge(n));
            } catch (InvalidAgeException e) {
                System.out.println("InvalidAgeException:"+e.getMessage());
            }
        }

    }

    static String inputAge(int n) throws InvalidAgeException{
        if (n == 0 || n < 0)
            throw new InvalidAgeException("The age must be a positive number");
        else
            return new String("I am " + n + " years old");
    }

}