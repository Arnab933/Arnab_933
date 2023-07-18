package DataStructureInJava.ArrayListconcept;

/*
 * int[][] arr = {
 * { 1, 2, 3 },
 * { 5, 6 },
 * { 4, 5, 6 }
 * };
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = 0; j < arr[i].length; j++) {
 * System.out.print(arr[i][j] + " ");
 * }
 * System.out.println();
 * }
 * System.out.println();
 * int[] arr1 = new int[6];
 * arr1[0] = 12;
 * arr1[1] = 13;
 * arr1[2] = 14;
 * arr1[4] = 15;
 * arr1[3] = 16;
 * arr1[5] = 17;
 * for (int i : arr1) {
 * System.out.print(i + " ");
 * }
 */

/*
 * Basically the concept of arraylist is coming when we don't know about the
 * size of the array then we give the control to java for the handle of the size of array
 */
/*
 * -----Syntex----- not mandatory
 * ArrayList<Integer>list=new ArrayList<Integer>();----here Arraylist is a class
 * and list is a object
 * here we can't use the primitive's data type we must be use the wrapper class
 * like Integer/Float
 * /String
 */
import java.util.*;

public class Array_list {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();// here the reference variable is ---list
        // Scanner in = new Scanner(System.in);
        /*
         * here the array list does't depends the initial capasity---> does't
         * mandatory
         */
        list.add(0);// add is a method for input a value that is defined in ArrayList class
        list.add(04);
        list.add(45);
        list.add(50);
        list.add(12);
        list.add(35);
        list.add(65);
        list.add(55);
        list.add(47);
        list.add(48);
        list.add(49);
        list.add(67);
        list.add(25);
        list.add(15);
        System.out.println("list " + list);
        ArrayList<Integer> newlist = new ArrayList<Integer>(list);// here as inttial capasity we passed--list--arraylist
        newlist.add(2003);
        newlist.add(2005);
        System.out.println("newlist:" + newlist);
        // list.set(0, 456);//set is a method that is used for modified any value.
        // ---Syntex------
        // list.set(index,new value);
        // list.remove(4);//remove is a method that is used for remove any value
        // System.out.println(list);
        // list.clear();
        /* ------for get item to input ----- */
        // in.close();
        // for (int i = 0; i < 5; i++) {//loop for input
        // list.add(in.nextInt());
        // }
        // for (int i = 0; i < 8; i++) {
        // System.out.println(list.get(i));
        // }
        // System.out.println(list);//print the array list
        System.out.println(list.remove(Integer.valueOf(15)));
        // for remove any element of the list to use
        // ---list.remove(rapper class object)---
        System.out.println("list " + list);
        System.out.println(list.get(2));// for get the the value of index 2
        System.out.println(list.size());// for print size of the list
        
    }

}
/*
 * 1.The size is fixed internally
 * 2.It will a new arraylist of say double the size old elements are copied in
 * new one
 * 3.old one is deleted
 */