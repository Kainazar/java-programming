package practice_my_self;
import java.util.Arrays;
public class ArrayTask {
    public static void main(String[] args) {
        String word = "kainazar is last Name";
        String[] sentence = word.split(" ");
        String reverse = "";
        System.out.println(Arrays.toString(sentence));
        for (int i = sentence.length - 1; i >= 0; i--) {
            reverse += sentence[i] + " ";
        }
        System.out.println("reverse = " + reverse);
        System.out.println("word = " + word);
        
        String words = "hello";
        String j = " ";
        for (int i =0; i<words.length()-1; i++);
        System.out.println(words.length());
        System.out.println(""+ words.charAt(0)+words.charAt(1)+words.charAt(2)+words.charAt(3)+words.charAt(4));
        
    }
}













