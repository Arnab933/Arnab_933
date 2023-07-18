import java.util.Scanner;

public class Sum_of_even_array {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the highest term:");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        ob.close();
    }
}
