public class Binary_Search_recursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 8;

        System.out.println(Search(arr, target, 0, arr.length - 1));
    }

    static int Search(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] < target) {
            return Search(arr, target, mid + 1, end);
        }
        if (arr[mid] > target) {
            return Search(arr, target, start, mid - 1);
        } else
            return mid;
    }
}
