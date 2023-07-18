/*if a data member is static,when the class is declared then the static data member autometically get
a memory in ram thats for the data member can be call using class not object .Also a static member function
can be call by using class(and . operator) not using object,note that the static method only accept those 
member that's are similarly static */
public class Staticmethod {
    public static void main(String args[]) {
        int a = Mathoperation.mul(20, 10); // call the static method by the class
        int b = Mathoperation.div(a, 10);// because this is a static method
        System.out.println("B=" + b);
    }
}

class Mathoperation {
    static int mul(int a, int b) {// declare a static method
        return (a * b);
    }

    static int div(int a, int b) {// also declare a static method
        return (a / b);
    }
}
