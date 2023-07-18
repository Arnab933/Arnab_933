import java.util.Scanner;

public class Smallest_no_arr {
    public static void main(String[] args) {
        System.out.println("Enter the size of the arary:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        int s = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i])
                s = arr[i];
        }
        System.out.println("The smallest no. of the array is:" + s);
        ob.close();
    }
}
