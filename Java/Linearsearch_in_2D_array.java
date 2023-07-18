import java.util.*;

public class Linearsearch_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5 },
                { 7, 8, 9 }
        };
        int target = 5;
        // System.out.println(arr.length);
        System.out.println(Search(arr));
        System.out.println(Max(arr));
        System.out.println(Arrays.toString(search(arr, target)));
        /*
         * here the ---search(arr,target);--returns an array for that reason i used
         * here the toString method for print that array
         */
        ;
    }

    public static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                    /*
                     * return a new array,here we used new keyword because we does't created any
                     * object
                     * for return a new array
                     */
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int Search(int arr[][]) {
        int max = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    public static int Max(int[][] arr) {
        int max = 0;
        for (int[] i : arr) {
            /* here every index of the array arr,is itself an array */
            for (int element : i) {
                /* here the every element of the array(i) */
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
