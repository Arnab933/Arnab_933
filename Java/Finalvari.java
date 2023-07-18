public class Finalvari {
    /*
     * Final is a modifier/keyword that is applicable method,variable as well
     * classes.If we declare final of a
     * class then we can't extend that class in a child class and if we declare a
     * variable as final then
     * we can't re initialize or increment or decrement the value of that
     * variable.similarly if we declare
     * a method as final then we can't override that method in child class
     */
    public static void main(String args[]) {
        final int a = 10;
        int b = 20;
        // a++;
        System.out.println("A=" + a + "\n" + "B=" + b);
    }

}
