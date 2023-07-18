import java.util.Scanner;
// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

public class Testing {
       
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        // while(true) {
            String n = input.next();
            // if (n == "x") 
            //     break;
            // else
                // ans = Integer.parseInt(n) + ans;
                ans=Integer.valueOf(n);
        // }
        input.close();
        System.out.println("Your ans is: " + ans);
    }
}