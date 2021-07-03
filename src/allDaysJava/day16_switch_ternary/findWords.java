package allDaysJava.day16_switch_ternary;

import java.util.Scanner;

public class findWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int c=0;
        for (int i=0; i<word.length();i++){
            c+=(word.contains("java"))? 1:0;
            word=word.replaceFirst("java","");

        }
        System.out.println(c);
    }


}


