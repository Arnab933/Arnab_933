import java.util.*;

public class Fibo_iteration {
    public static void main(String[] args) {
        System.out.println("Enter the term:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        
        int n1 = 0, n2 = 1;
        for (int i = 1; i <= n; i++) {
            int n3 = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
