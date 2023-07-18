public class HierarichicaInheri {
    public static void main(String[] args) {
        Derived1 ob=new Derived1(10, 20);
        ob.show();
    }
}
class Base{
    int a;
    Base(int a){
        this.a=a;
    }
    void show(){
        System.out.println("I am in class Base and a="+a);
    }
}
class Derived1 extends Base{
    int a;
    Derived1(int a,int b){
        super(b);
        this.a=a;
    }
    void show(){
        System.out.println("I am in class Derived and sum is:"+(a+super.a));
    }
}
