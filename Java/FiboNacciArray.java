import java.util.Arrays;
import java.util.Scanner;

class FiboNacciArray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the total term of the series:");
        int n = ob.nextInt();
        ob.close();
        
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 1)
                arr[i] = i;
            else
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
