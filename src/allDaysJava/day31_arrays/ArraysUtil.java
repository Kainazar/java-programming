package allDaysJava.day31_arrays;


import java.util.Arrays;

import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] number = {99, 15,22,15,7,10};
        // print all numbers in same line;
        System.out.println(Arrays.toString(number));
        // print with sort numbers;
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        // print min number
        System.out.println("min value: " + number[0]);
        // print largest number
        System.out.println("max value: " +number[number.length-1]);

        String[] words = {"Java", "C++", "Ruby", "Kotlin","assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+ "]");
        // sort words in alphabetic and Ascii order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse;
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }

}
