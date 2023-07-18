package AllAboutString;
import java.util.*;

public class String_concept2 {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("arnab");
        System.out.println(34.56);
        String s = String.valueOf(new int[] { 12, 34 });/******/
        System.out.println(s);
        // String s1 = "arnab";
        // System.out.println(s1);
        // Integer n = 23;
        // System.out.println(n);
        // /*
        // * here output is will be a hashcode because --new int[]{12,34}---is an object
        // * of the array.
        // * Internally toString method print it.
        // */
        System.out.println(Arrays.toString(new int[] { 12, 34 }));
        // /* Array class's toString method executes here*/
        float a = 453.1264f;
        System.out.printf("%.2f", a);
        System.out.println();
        /**
         * Here ---printf(String format,object...args)-- is a method that is defined in
         * printstream class and returns it format...........(no idea about it)
         * this funtion print the number in round form like 12.54=12.55
         */
        System.out.printf("%.2f", Math.PI);
        /*
         * also we can print many types of object like c programming by
         * using--printf()-- method
         */
        System.out.printf("My name is %s and i am a student of %s", "Arnab Pratihar", "Midnapore Collage");
        /*
         * place holders in java------
         * %c=Character
         * %d=Decimal number(bace 10);
         * %e=Exponential floating-pont number;
         * %f=Floating point number;
         * %i=Integer(base 10);
         * %o=Octal number(base 10);
         * %s=String
         * %u=Unsigned decimal number(base 10);
         * %x=Hexadecimal number(base 10);
         * %t=Time/date;
         */
        System.out.println();
        System.out.println('a' + 'b');// here print the total ascii value of 'a' and 'b'
        System.out.println("a" + "b");
        /*
         * but here print the string "ab" because here "+" is works
         * like a concatinate operator
         */
        System.out.println('a' + 3);// as same here print the total ascii value of 'a'+3=100;
        System.out.println(1 + "a");
        /*
         * when we will try display string with int(like 1,etc) then
         * display---a1---because here int 1;is
         * converted into Integer 1;that means ---toString();
         */
        System.out.println("Arnab" + new ArrayList<>());
        /*
         * ArrayList types object is empty for this reason --toString method returns a
         * [] bracket so print
         * Arnab[]
         */
        System.out.println("Arnab" + String.valueOf(578));
        // System.out.println(new Integer(56)+ new ArrayList<>());
        /*
         * here we get an error because in java we can use "+" operator for
         * primitive,String and at least
         * one String should have present.
         */
        // System.out.println( new ArrayList<>() + new ArrayList<>() );
        /*
         * here we get an error because two objects are complex type and no have any
         * string type
         */
        System.out.println(new ArrayList<>() + "" + new ArrayList<>());
        /*
         * here no error coming because betweem two complex objects there is a string
         * object
         */
    }
}