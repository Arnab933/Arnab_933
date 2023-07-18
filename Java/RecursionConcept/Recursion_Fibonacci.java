package RecursionConcept;
public class Recursion_Fibonacci {
    public static void main(String[] args) {
        /* [Fibo(n)=Fibo(n-1)+Fibo(n-2)]---->common sense */
        System.out.println(fibo(7));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;// for if i get n=0 then return 0 and get 1 then return 1
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
