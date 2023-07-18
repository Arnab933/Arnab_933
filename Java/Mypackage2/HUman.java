package Mypackage2;

import Human_package.Human;

class HUman {
    public static void main(String args[]) {
        Human sp = new Human(12, 12000, "Sujit", false);
        Human ap = new Human(21, 10000, "Arnab", true);
        System.out.println(ap.population);
    }
}