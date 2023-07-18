package ExceptionHandling;

class Default_Exception{
    public static void main(String[] args) {
       fun1();
    }

static void fun1(){
     System.out.println("I am in fun1");
      fun2();
}
static void fun2(){
    System.out.println("I am in fun2");
    fun3();
} 
static void fun3(){
    System.out.println(10/0);
}
}
/* Noticed that here doesen't have any exceptiob handler.At first the exception is created in the fun2() method as the
 * doesen't have any exception handler in that method so this method ask the fun2() method for handle the exception because
 * the fun2() method calls him and the fun2() method calls the fun1() method for handle the exception and so on.
 * The the main method is called for handle the exception for no any exception handler in the main method he doesen't 
 * handle this exception at last the JVM is called because the JVM is executes this program.And that time calls the 
 * Default Exception handler and handle this program */