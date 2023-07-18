public class Static_vari {

    public static void main(String[] args) {
        Stati ob = new Stati();
        System.out.println(ob.a);
        ob.show();
    }

}

class Stati {
    static int a = 40;

    void show() {
        System.out.println("I am in Stati class");
    }
}
