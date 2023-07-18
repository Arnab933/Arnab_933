public class AutoBoxing {
    public static void main(String[] args) {
        int a = 10; 
        Integer a1 = a;
        System.out.println(a1);
        System.out.println(a==a1);
        System.out.println(a1.equals(a));
    }
}