import java.util.*;

public class Fact_series {
    public static void main(String[] args) {
        System.out.println("Enter the term:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = i;
        }
    }

    public static int fact(int n) {
        int p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
        }
        return p;
    }
}
