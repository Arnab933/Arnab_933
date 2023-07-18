import java.util.Arrays;

public class IntegerToChararray {
    public static void main(String[] args) {
        int c = 0;
        int[] arr = { 1, 3, 4, 5, 6, 6, 5, 8 };
        String str = Arrays.toString(arr);
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i)) == 5) {
                str = str.replace(str.charAt(i), '_');
                c++;
            }
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (str.charAt(i) == '_') {
                arr[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
