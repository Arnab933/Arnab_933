package AllAboutString;
import ArnabPackage.PrintArray;
import ArnabPackage.PrintString;

public class Stringprint {
    public static void main(String[] args) {
        String str = "Medinipur Collage";
        System.out.println(PrintString.toPrintString(str));
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(PrintArray.toPrintArray(arr));
    }

}
