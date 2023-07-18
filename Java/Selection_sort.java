import java.util.*;

public class Selection_sort {
    public static void main(String[] args) {
        System.out.println("Enter size of the array:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println(Arrays.toString(selection_sort(arr)));
        ob.close();
    }

    static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
