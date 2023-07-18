import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        System.out.println("Enter size of the array:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        // int[] arr = { 4, 7, 6, 3, 9, 6, 8, };
        System.out.println(Arrays.toString(bubble_sort(arr)));
        ob.close();
    }

    public static int[] bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}