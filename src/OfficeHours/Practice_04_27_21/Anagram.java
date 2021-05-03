package OfficeHours.Practice_04_27_21;

import java.util.Arrays;

public class Anagram {
    /**
     * [Anagram]
     *
     * Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram return true otherwise return false.
     *
     * Anagram means the characters of the words are the same, but rearranged in different orders
     *
     * For example:
     *     listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'
     *
     *
     */
    public static void main(String[] args) {
        isAnagram("Listen", "silent");
    }
    public  static boolean isAnagram( String one, String two){

        if (one.length() != two.length()){
            return false;
        }
        one = one.toLowerCase();
        two = two.toLowerCase();

        int [] count = new int [26];

        for (int i = 0; i < one.length(); i++) {

            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);
            count [0] = count [0] +1;
            count[letterFromOne - 97] = count [letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count [letterFromTwo - 97] -1;

            System.out.println(Arrays.toString(count));
        }
        return  Arrays.equals(count, new int [26]);

    }
}
