public class Static_variable {
    public static void main(String[] args) {
        Test a = new Test("arnab");
        Test b = new Test("ap");

        System.out.println(a.name);
        System.out.println(b.name);
        // both output are same because the String name is static
    }
}

class Test {
    public static String name; // static variable

    public Test(String name) {
        this.name = name;
    }
}