package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int m = ob.nextInt();
        // int n = ob.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter elements of the array:");
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = ob.nextInt();

            }
            System.out.println("Enter the index for access value:");
            int p = ob.nextInt();
            try {
                System.out.println("The vlaue of the index is " + arr[p]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Pls enter the valid index");
            }
        } catch (InputMismatchException e) {
            System.out.println("Pls enter valid input");
        }

    }
}
