
/*Given an array of integers [nums] and an integer target,return indices of the two numbers such that add up 
 * to [target]------nums={2,7,11,5},target=9;
*/
import java.util.*;

public class Target_number {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; i < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(Target_number.twoSum(arr, target)));
    }
}
