import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PhoneNumberToWords {
    public static void main(String[] args) {
        String phoneNumber = "3662277";
        String[] words = { "foo", "bar", "baz", "foobar", "emo", "cap", "car", "cat" };
        System.out.println(Arrays.toString(phonenumberTowords(phoneNumber,words)));
    }
    static String[] phonenumberTowords(String phoneNumber,String[]words){
        HashMap<Character,Character>map=new HashMap<>();
        map.put('a', '2'); map.put('b', '2'); map.put('c', '2'); map.put('d', '3'); 
        map.put('e', '3'); map.put('f', '3'); map.put('g', '4'); map.put('h', '4');
        map.put('i', '4'); map.put('j', '5'); map.put('k', '5'); map.put('l', '5');
        map.put('m', '6'); map.put('n', '6'); map.put('o', '6'); map.put('p', '7');
        map.put('q', '7'); map.put('r', '7'); map.put('s', '7'); map.put('t', '8');
        map.put('u', '8'); map.put('v', '8'); map.put('x', '9'); map.put('y', '9');
        map.put('z', '9');
        String[]number=new String[words.length];
        for (int i = 0; i < number.length; i++) {
            number[i]="";
            for (int j = 0; j < words[i].length(); j++) {
                number[i]+=map.get(words[i].charAt(j));
            }
        }
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            if(phoneNumber.contains(number[i]))
            arr.add(i);
        }
        String []st=new String[arr.size()];
        for (int i = 0; i < st.length; i++) {
            st[i]=words[arr.get(i)];
        }
        return st;
    }
}
