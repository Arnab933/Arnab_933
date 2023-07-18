public class Static_class {
    public static class Demo {
        static int a = 10;

        // public static void my_method() {
        // System.out.println("I am Arnab Pratihar");
        // }
        public void my_method() {
            System.out.println("I am Arnab Pratihar");
        }
    }

    public static void main(String args[]) {
        Demo ob = new Demo();

        ob.my_method();
        System.out.println(Static_class.Demo.a);
    }
}
/*
 * If the inner nested class is static but the beside the inner class method is
 * non-static then we have to
 * create an object for the non-static method by using the static class or the
 * outer nin-static class and then
 * we heve to call the non static method for execute
 */
