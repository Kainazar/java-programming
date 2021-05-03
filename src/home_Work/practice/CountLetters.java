package home_Work.practice;

public class CountLetters {
    public static void main(String[] args) {
        String word = "Apple tree";
        String unique = "";
        int count =0;

        for (int i = 0; i < word.length()-1; i++) {
            if (word.equals("")){
                count++;
                System.out.println(word+count+i);
            }
        }


    }
}
