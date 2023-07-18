public class LongestCommonPrefix2 {
    public static void main(String[] args) {
        String[] str = { "ab", "a" };
        System.out.println(longest_prefix(str));
    }

    public static String longest_prefix(String[] str) {
        if (str.length == 0 || str == null) {
            return "";
        }
        String st = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > str[i + 1].length()) {
                st = str[i];
            }
        }
        String common = "";
        for (int i = 0; i < st.length(); i++) {
            for (int j = 0; j < str[j].length(); j++) {
                if (st.length() != 0 && st.charAt(i) != str[j].charAt(i)) {
                    System.out.println(common);
                    System.exit(0);
                }
            }
            common += st.charAt(i);
        }
        return st;
    }
}