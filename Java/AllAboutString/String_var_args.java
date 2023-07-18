package AllAboutString;
class String_var_args {
    String_var_args(String... a) {
        for (String i : a) {
            System.out.println("hell0" + i);
        }
    }

    public static void main(String args[]) {
        new String_var_args(" ASDFGH", " ASDFGHJK");
    }

}