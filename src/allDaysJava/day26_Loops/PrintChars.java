package allDaysJava.day26_Loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "Erkin";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + " - " + word.toUpperCase().charAt(i));


        }
        System.out.println();
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.println(i+ " - "+ word.charAt(i));

        }
    }
}
