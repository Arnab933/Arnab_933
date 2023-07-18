/*A method can be called by using only use its name by another method of same class.This is known as 
 nesting method*/
class Nestingmethod {
    public static void main(String args[]) {
        Nesting ob = new Nesting(10, 20);
        ob.display();
    }
}

class Nesting {
    int a, b;

    Nesting(int m, int n) {// create a constructor
        a = m;
        b = n;
    }

    int big() {
        if (a < b)
            return (b);
        else
            return (a);
    }

    void display() {
        int large = big(); // call the big method by using only it's name under the display
                           // method(nesting method) in the same class
        System.out.println("Big=" + large);
    }
}