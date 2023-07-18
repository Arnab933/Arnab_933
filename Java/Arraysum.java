import java.util.Scanner;

class arraysum {
    public static void main(String args[]) {
        int n;
        System.out.println("Enter size of the array");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        ob.close();
        System.out.println("The sum of the array is:" + sum(arr, n));
    }

    static int sum(int arr[], int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + arr[i];
        }
        return (s);
    }

}