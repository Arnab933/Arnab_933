package ArrayIndex;

public class NewException{
    public static void main(String[] args) {
        int[]arr={0,1,2,3,4,5};
        int n=6;
        try{
        System.out.println(setdata(arr, 6));
        }
        catch(ArrayIndexoutException a){
               System.out.println(a.getMessage());
        }
    }
    static int setdata(int[]arr,int n) throws ArrayIndexoutException{
        if(arr.length<n){
             throw new ArrayIndexoutException("The length of the array is smaller than the accessable index number");
        }
        return arr[n];
    }
}