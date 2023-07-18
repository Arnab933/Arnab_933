package Mypackage2;

import Mypackage.Myclass;/*Import the Mypackage ,Myclass */

class Myclass2 {
    public static void main(String[] args) {
        Myclass ob = new Myclass(0, 0);// create a object of Myclass
        ob.getNames("Arnab");// call the method of Myclass by ob object and pass the
        // "Arnab" as String args
        Myclass.myname("Sujit");// as the myname is a static method that's for call
        // the myname method by Myclass
    }
}
