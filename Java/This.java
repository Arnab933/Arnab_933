public class This {
    String name;
    int roll;
    double marks;

    This(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        System.out.println(this.name = name);
        System.out.println(this.roll = roll);
        System.out.println(this.marks = marks);
    }

    void greeting() {
        System.out.println("hello my name is " + this.name);
    }

    public static void main(String[] args) {
        This arnab = new This("arnab", 12, 34.56);
        System.out.println();
        This sujit = new This("sujit", 15, 45.67);
        arnab.greeting();//here i call this method by using arnab reference so out will be arnab
    }
}