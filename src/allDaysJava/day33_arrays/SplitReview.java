package allDaysJava.day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "javajav";
        String[] array= word.split("a");
        System.out.println(array.length);
        int countOfA = array.length-1;
        if (word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);
        System.out.println("========== Split with empty String ===========");
        String [] strArray = word.split("");
        System.out.println(strArray[0]);

        String word1 = "java1html2sql";
        String[] strArray1 = word1.split("\\d");
        System.out.println(Arrays.toString(strArray1));


        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
