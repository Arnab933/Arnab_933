
public class Int_pali {
    public static boolean check_pali(int a) {
        String s = String.valueOf(a);
        // convert the int(121) value into String("121")
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                /* charAt(index)------is a method that returns the character on an index */
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int a = 121;
        if (check_pali(a))
            System.out.println("Palindrome");
        else
            System.out.println("no");
    }
}
