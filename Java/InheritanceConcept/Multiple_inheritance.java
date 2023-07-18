// public class Multiple_inheritance extends Multi1,Multi2,Multi3{
// //Error because jdk can't find how do work,that's reason we have to learn Interface 
//     public static void main(String[] args) {
//         Multiple_inheritance ob = new Multiple_inheritance();
//         ob.multi();
//     }
// }

class Multi1 {
    void multi() {
        System.out.println("I am in multi1");
    }
}

class Multi2 {
    void multi() {
        System.out.println("I am in multi2");
    }
}

class Multi3 {
    void multi() {
        System.out.println("I am in multi3");
    }
}