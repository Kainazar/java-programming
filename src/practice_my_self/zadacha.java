package practice_my_self;

import java.util.Scanner;

public class zadacha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverse = "" + word.charAt(9) + word.charAt(8)
                + word.charAt(7) + word.charAt(6) + word.charAt(5)
                + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(reverse.toUpperCase());


        String word1 = scan.nextLine();
        //write your code below
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||
                    word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'u') {
                System.out.print(word.charAt(i));
            }
        }
        String sentence = scan.nextLine();

        int number = 4;
        if (sentence.length() <= number) {
            System.out.println("true");

        } else if (sentence.equalsIgnoreCase("Python")) {
            System.out.println("true");

        } else {
            System.out.println("false");


        }

    }
}







