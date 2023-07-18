import java.util.ArrayList;
import java.util.Scanner;

class TwinPrime {
    public static void main(String[] args) {
        System.out.println("Enter the bound:\nUpper range:");
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println("Enter the lower bound");
        int m = ob.nextInt();
        ob.close();

        ArrayList<Integer> list = new ArrayList<>();

        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (IsPrime(i))
                   list.add(i); 
            }
            
            System.out.println("Twin primes are:");
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 1) == 2) {
                    System.out.print(+list.get(i - 1) + " ");
                }
            }
        } else {
            System.out.println("Enter the valid bound");
        }
    }

    public static boolean IsPrime(int n) {
        if (n <= 1)
            return false;
        int c = 2;
        if (c * c <= n) {
            if (n % c == 0)
                return false;
            c++;
        }
        return true;
    }
}
// import java.util.Scanner;
// import java.util.Stack;

// public class TwinPrime {
//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);
//         System.out.println("Enter the range\nEnter the lower bound:");
//         int m = ob.nextInt();
//         System.out.println("Enter the upper bound:");
//         int n = ob.nextInt();
//         twinPrime(m, n);
//         ob.close();
//     }

//     static void twinPrime(int m, int n) {
//         Stack<Integer> prime = new Stack<>();
//         prime.push(-1);
//         for (int i = m; i <= n; i++) {
//             if (IsPrime(i)) {
//                 int previous = prime.pop();
//                 if (i - previous == 2) {
//                     System.out.println(previous + " "+i);
//                 }
//                 prime.push(i);
//             }
//         }
//     }

//     static boolean IsPrime(int n) {
//         if (n == 1 || n == 0)
//             return false;
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }
// }


//     // import java.util.*;

// // public class TwinPrimes 
// // {
//     // public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.print("Checking for twin prime numbers between a range~ \nEnter lower bound: ");
//         int m = in.nextInt();
//         System.out.print("Enter upper bound: ");
//         int n = in.nextInt();
//         in.close();

//         if(m>n)
//             throw new ArithmeticException("Enter a valid range!");

//         Stack<Integer> primes = new Stack<>();
//         primes.push(-1);

//         System.out.println("\nTwin primes in the given range are: ");
//         for (int i = m; i <= n; i++) {
//             if(isPrime(i)) {
//                 int previous = primes.pop();
//                 if(i - previous == 2)
//                     System.out.println(previous + ", " + i);
//                 primes.push(i);
//             }
//         }
//     }

//     static boolean isPrime(int n) {
//         if(n<2)
//             return false;

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if(n%i == 0)
//                 return false;
//         }

//         return true;
//     }
// }
