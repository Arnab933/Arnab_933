package NumberSystem;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 2);
            n = n / 2;
        }
        int[] arr = new int[list.size()];
        int p = list.size();
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(--p);
        }
        System.out.println(Arrays.toString(arr));
        ob.close();
    }
}