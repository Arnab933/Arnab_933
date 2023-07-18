/*Q.Search for 3 in the range of index[1 to 4] */
public class Linear_Search_in_range {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 1; i <= 4; i++) {
            if (arr[i] == 5) {
                System.out.println(i + 1);
            }
        }
    }
}
