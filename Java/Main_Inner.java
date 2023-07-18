class OuterrClass {
    void outer() {
        System.out.println("i am in outer");
    }

    class Inner {
        public void inner() {
            // public static void inner{
            System.out.println("i am in inner");
        }
    }
}

class Main_Inner {

    public static void main(String[] args) {
        OuterrClass ob = new OuterrClass();
        ob.outer();
        OuterrClass.Inner ob1 = new OuterrClass().new Inner();
        // OuterrClass.Inner.inner();if the method is static
        ob1.inner();
    }
}