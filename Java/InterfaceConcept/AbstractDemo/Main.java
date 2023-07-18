package InterfaceConcept.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son =new Son(19);
        son.carrer("Engineer");
        son.partner("Debjit", 21);

        // Daughter daughter=new Daughter(11);
        Parent daughter=new Daughter(12);
        daughter.carrer("Doctor");
        daughter.partner("Atul",19);
        Parent.hello();//call the static method of the abstract class 
        // Parent ob=new Parent() {
            
        // };
       
        /* we can't create object of the abstract class directly if we try to create object of the abstract 
         * class then we have to override the abstract method of that class */
    }
}
