package home_Work.practice;

public class HalfLength {
    public static void main(String[] args) {
        String word = "aaabbcdd";
        String output = "";

        for (int i = 0; i < word.length(); i++) {
                if (!output.contains(""+word.charAt(i))){
    output+=word.charAt(i);
}

                }
        System.out.println(output);
            }
        }



