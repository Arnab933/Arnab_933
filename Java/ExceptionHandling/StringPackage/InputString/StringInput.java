package StringPackage.InputString;
import java.util.*;
public class StringInput {
    public static String input(){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=ob.next();
        ob.close();

        return str;
    }
}
