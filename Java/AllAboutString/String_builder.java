package AllAboutString;
public class String_builder {
    public static void main(String[] args) {
        System.out.println("arnab" + (8 + 5));
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            /*
             * here 'a' is a character for this reason here print the aascii value
             * will be printed and after for type casting the value will be a character
             */
            series += ch;
            // System.out.println(ch);
            /*
             * here --series-- does't changes because String is immutable and every time it
             * will be copied a new
             * string and that is assined into string variable(series);
             */

        }
        System.out.println(series);
        String s = "Arnab";
        String p = s.concat("pratihar");
        System.out.println(s);
        /*
         * here s is not changed means s still point "Arnab" but a new object is created
         * that points now
         * "Arnabpratihar" that's why String is immutable in java
         */
        System.out.println(p);// now p is points "Arnabpratihar";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        builder.deleteCharAt(0);
        // we can delete any character by using --deletecharAt(index)--method
        System.out.println(builder);
        builder.delete(0, 3);
        // we can delete multi character by using --delete(from index,to index)--method
        // here we have to focus that the delete method does not works modified(deleted)
        // string it works only
        // previous string
        System.out.println(builder);
        // out put:efghijklmnopqrstuvwxyz
        builder.reverse();
        System.out.println(builder);
    }
}
