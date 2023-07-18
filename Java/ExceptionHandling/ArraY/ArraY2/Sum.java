package ArraY.ArraY2;

public class Sum {
    public static int sum(int arr[]) {
        int s = 0;
        // s++;
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
        }
        return s;
    }

}
