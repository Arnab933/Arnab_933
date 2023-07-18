class GetterSetter{
     private String name;
     private int age;

     public void Setter(String name,int age){
        this.name=name;
        this.age=age;
     }

     public String Getter1(){
        return name;
     }

     public int Getter2(){
        return age;
     }
}
 class Set{
    public static void main(String[] args) {
        GetterSetter ob=new GetterSetter();
        ob.Setter("Arnab", 19);
        System.out.println("Name:"+ob.Getter1());
        System.out.println("Age is:"+ob.Getter2());
        
    }
}