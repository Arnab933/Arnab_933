public class CheckPalin {
    public static void main(String[] args) {
        int n = 515;
        if (checkpalin(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
     static boolean checkpalin(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
