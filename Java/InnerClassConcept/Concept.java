package InnerClassConcept;

public class Concept {//outer class can't be static because the inner class depends on outer class
    static class Inner{//but the inner class can be static 
        String name;
        Inner( String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Inner ob=new Inner("Arnab");
        System.out.println(ob.name);
    }
}

