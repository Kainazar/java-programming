package OfficeHours.Practice_05_02_21;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word" ));
        String targetWord = "java";

        int count = 0;

        for(String word: words){
            if(word.equals(targetWord)) {
                count++;
            }

        }

        System.out.println(targetWord + " was found " + count + " times");
    }
}
