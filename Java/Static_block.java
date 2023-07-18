public class Static_block {
    static int a = 4;
    static int b;

    static { // static block will be executed just once when the first object is created
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String args[]) {
        // Static_block ob = new Static_block();// object created
        System.out.println(Static_block.a + " " + Static_block.b);

        Static_block.b += 3;
        System.out.println(Static_block.a + " " + Static_block.b);

        // Static_block ob2 = new Static_block();// again object created but static
        // block does't executed again
        System.out.println(Static_block.a + " " + Static_block.b);

    }
}
