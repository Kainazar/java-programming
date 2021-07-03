package allDaysJava.day26_Loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println("There are " + count + " " + letter +"'s in " + word);

    }
}
