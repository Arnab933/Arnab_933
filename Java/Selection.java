import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
                System.exit(0);
            }
        }
        System.out.println(nums[nums.length - 1]);
    }
}
