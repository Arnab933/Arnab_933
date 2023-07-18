import java.util.Scanner;

public class Second_large_arr {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the arry:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("second largest element is :" + arr[n - 2]);
        ob.close();
    }
}
