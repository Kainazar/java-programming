package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        //declare String arrayList and add values
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("input");
        // pass the words list to printList method
        printStrList(words);
        printStrList(Arrays.asList("select", "br", "option"));
        List <Integer> nums= Arrays.asList(23, 555, 455, 457, 45854);
       sumIntegerList(nums);
        System.out.println("nums = " + nums);

    }

    /**
     * MethodName : printStrList
     * param: List of String
     * return: void
     * prints all values separated by space in same line
     */
    public static void printStrList(List<String> str) {
        List<String> printStrList = new ArrayList<>();
        for (String s : str) {
            System.out.println(s + " ");
        }
        System.out.println();


    }

    /**
     * method name: sumIntegerList
     * param: List of Integer
     * return : int
     * calculate sum of integer in the list them returns
     */

    public static int sumIntegerList(List<Integer> list) {
        List<Integer> sumIntegerList = new ArrayList<>();
        int sum = 0;
        for (int e : list) {
            sum+=e;
            System.out.println(e + " ");
        }
        return sum;
    }


}

