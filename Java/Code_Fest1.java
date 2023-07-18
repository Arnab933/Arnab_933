public class Code_Fest1 {
    public static void main(String[] args) {
        String s = "abaxxyxxeeaxaee";
        Palindromic(s);
    }

    static void Palindromic(String s) {
        String str1 = new String();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o'
                    || s.charAt(i) != 'u') {
                str1 += s.charAt(i);
                if (str1.length() == 5) {
                    if (ispalin(str1)) {
                        System.out.println(str1);
                    } else
                        System.out.println("nothing");
                }

            }
        }

    }

    static boolean ispalin(String str2) {
        for (int i = 0; i < str2.length() / 2; i++) {
            if (str2.charAt(i) != str2.charAt((str2.length()) - 1 - i))
                return false;
        }
        return true;

    }

}