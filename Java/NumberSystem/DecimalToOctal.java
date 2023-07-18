package NumberSystem;
import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.close();
        
        String str="";
         while(n!=0){
            int r=n%8;
            str=r+str;
            n/=8;
         }
         System.out.println(str);
    }
}
