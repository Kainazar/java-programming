package OfficeHours.Practice_04_06_21;

public class Palindrome {
    public static void main(String[] args) {
        String word = "annaadhd";
        boolean isPalindrome = true;
        // Questions : What if your String has million characters.

        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i)!=word.charAt(word.length()-1-i)){
                isPalindrome = false;
                break;


            }

        }
        System.out.println(isPalindrome);
    }
}
