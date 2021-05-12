package home_Work.practice;

public class removeDuplicateLetter {
    public static void main(String[] args) {
        String word = "kainazarov";

        System.out.println(nonDup(word));

    }
    public static String nonDup(String name) {
        String output = "";
        for (int i = 0; i < name.length(); i++) {

            if (output.contains(""+name.charAt(i))){
     continue;
          }else{
    output += name.charAt(i);
          }
        }
        return output;
    }

}
