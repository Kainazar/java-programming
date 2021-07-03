package allDaysJava.day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] wordsArray = sentence.split(" ");
        System.out.println("1st word = "+wordsArray[0]);
        System.out.println("2st word = "+wordsArray[1]);
        System.out.println("3st word = "+wordsArray[2]);
       // System.out.println("3st word = "+wordsArray[3]); outOfBound
        System.out.println(Arrays.toString(wordsArray));

        String googleResult = "About 1,810,000 results (0.68 seconds)";
String [] result = googleResult.split(" ");
        System.out.println(result[1]);
        System.out.println(result[3]);//1 way
        System.out.println(result[3].substring(1));//2 way
        System.out.println(result[3].replace("(",""));//3 way

    }
}
