package OfficeHours.Practice_04_06_21;

public class LongestSubstring {
    public static void main(String[] args) {
        // aaabbbccccccdddee Output:ccccc


        String str = "aaabbbccccccdddeeee";
        String longestSubstring = "";
        String temp = "";
        for (int i = 0; i < str.length() - 1; i++) {
            temp += str.charAt(i);
            if (i == str.length() - 2) {
                System.out.println(i);

                if (str.charAt(i) != str.charAt(i + 1)) {

                    if (temp.length() > longestSubstring.length()) {
                        longestSubstring = temp;
                    }
                    temp = "";
                }


            }
            System.out.println("Longest substring - " + longestSubstring);
        }
    }
}
