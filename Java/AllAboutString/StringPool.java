package AllAboutString;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "Arnab";
        String str2 = "Arnab";
        System.out.println(str1.equals(str2));
        String str3 = new String("Arnab");
        System.out.println(str1.equals(str3));// this method just checks the value of two objects
        System.out.println(str2 == str3);// but these method checks value as well as reference
        StringBuilder sb = new StringBuilder(str3);
        sb.append("Pratihar");
        System.out.println(sb.equals("ArnabPratihar"));
        System.out.println(sb);
    }
}
