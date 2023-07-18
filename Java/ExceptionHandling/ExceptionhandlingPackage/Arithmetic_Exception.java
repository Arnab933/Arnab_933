package ExceptionhandlingPackage;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // System.out.println(a/b);
        try {
        //    int p=divide(a,b);
        //    System.out.println(p);
        System.out.println(divide(a,b));
            
        } catch (ArithmeticException e) {//if here occurs the arithmetic exception then executes this body otherwise
            //executes other catch body
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {//we can't write this body on the ArthmeticException body because the Exception clall also
        //contains ArtithmeticException class
            System.out.println(e.getMessage());
        }
        finally {//finally is a block that executes any time doesn't depends on the exception
        //finally block is created only one in our programe
            System.out.println("finally executes every time ");
        }
    }
    
    static int divide(int a,int b) throws ArithmeticException
    {
        // ArithmeticException p=new ArithmeticException("please don't divide by zero");
        if(b==0){
            // throw p;
            throw new ArithmeticException("Please don't divide by zero!!");
        }
        return a/b;
    }
}
