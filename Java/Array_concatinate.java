import java.util.*;

public class Array_concatinate {
    public static void main(String args[]) {
        int[] nums = { 1, 2, 1, 4, 5, 6, 7 };
        Concati ob = new Concati();
        System.out.println();
        System.out.println(Arrays.toString(ob.getconcati(nums)));
    }
}

class Concati {
    int[] getconcati(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }
}