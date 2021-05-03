package OfficeHours.practice_03_29_21;

public class MOveFist {
    public static void main(String[] args) {
        String str = "  Java is a fun language";
        str = str.trim();
        int space = str.indexOf(" ");
        String firstWord = str.substring(0,space);
        System.out.println(firstWord);
        System.out.println(str.substring(space + 1)+ " "+ firstWord);

        String word = "string";
        System.out.println(word.substring(5));
    }
}
