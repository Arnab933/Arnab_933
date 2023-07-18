import java.lang.String;

public class Common_string {
    public static String common_string(String str1, String str2, String str3) {
        String str4 = " ";

        for (int i = 0;; i++) {
            if (str1.charAt(i) == str2.charAt(i) && str2.charAt(i) == str3.charAt(i)) {
                str4 = (str4 + str2.charAt(i));
            } else
                return str4;
        }

    }

    public static void main(String[] args) {
        String str1 = "arnab";
        String str2 = "arnab";
        String str3 = "arnab";
        System.out.println(common_string(str1, str2, str3));

    }
}
