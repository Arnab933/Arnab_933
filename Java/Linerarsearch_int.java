
import java.util.Scanner;

class Linerarsearch_int {
    public static void main(String args[]) {
        int n, key;
        System.out.println("Enter size of the array");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println("Enter the key for search");
        key = ob.nextInt();
        int result = search(arr, key);
        if (result == -1)
            System.out.println("The element is not present");
        else
            System.out.println("The element is present on " + (result) + "th position");
        ob.close();
    }

    public static int search(int arr[], int a) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a)
                return i;
        }
        return -1;

    }
}