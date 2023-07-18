public class DuplicateString {
    public static void main(String[] args) {
        String str="Arnab";
        String s="";
    System.out.println(duplicate(str.toLowerCase(), 0,s));
    }
    static String duplicate(String str,int i,String s){
        if(i==str.length()){
            return s;
        }
       if(s.indexOf(str.charAt(i))==-1){
        s+=str.charAt(i);
       }
       return duplicate(str, i+1, s);
    }
}
