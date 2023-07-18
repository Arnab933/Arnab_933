import java.util.*;

public class Fibonacci_arr {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the term:");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        int[] arr = new int[n];
        arr[0] = 0;
        for (int i = 2; i < n; i++) {
            arr[1] = 1;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
        ob.close();
    }
}
