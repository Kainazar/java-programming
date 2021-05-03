package OfficeHours.Practice_04_07_21;

public class CamelCase {
    public static void main(String[] args) {
//        Given a String of words that follow Camel Case convention. Find and print how many words are in the given String.
//                Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
//        Ex:
//        Input: thisHasManyWordsToFind Output: 6
        String str = "thisHasManyWordsToFind";
        int words = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>= 'A' && str.charAt(i)<= 'Z'){
                words++;
            }
        }

        System.out.println("words = " + words);
    }
}
