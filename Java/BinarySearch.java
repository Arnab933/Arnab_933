import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Ener size of the arrey:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = ob.nextInt();
        int ans = binarySearch(arr, target);
        if (ans == -1)
            System.out.println("The number is not found");
        else
            System.out.println("The number is found at the " + (ans + 1) + "th position");
        ob.close();
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;

            else
                return mid;

        }
        return -1;
    }

}