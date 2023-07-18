
import java.util.Scanner;

public class LargestWordInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        String largestWord = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }
        System.out.println("Largest word in the string is: " + largestWord);
        sc.close();
    }

}
