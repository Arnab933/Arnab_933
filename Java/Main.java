class Main {
    static int x = 209;

    public static void main(String[] args) {

        Main main1 = new Main();
        System.out.println(main1 instanceof Main);

        int x = Integer.MAX_VALUE;

        if (true) {
            System.out.println(x);
            x = 2;
            System.out.println(x);
            int a = 10;
            int b = 11;

            a = (b < a) ? a : b;
            System.out.println(a);
        }
    }
}