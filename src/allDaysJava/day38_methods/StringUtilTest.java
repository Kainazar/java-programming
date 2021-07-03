package allDaysJava.day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname
 */
import static allDaysJava.day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));


        String word = "cybertek";
        String revword = StringUtils.reverse(word);
        System.out.println("revword = " + revword);
        System.out.println("word = " + word);


    }
}
