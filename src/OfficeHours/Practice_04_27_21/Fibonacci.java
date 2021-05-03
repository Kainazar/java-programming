package OfficeHours.Practice_04_27_21;

import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;

public class Fibonacci {
    /**
     * Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
     *
     * Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
     *
     * Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
     *
     * Ex:
     *     Input:
     *         8
     *     Output:
     *         0, 1, 1, 2, 3, 5, 8, 13, 21
     */
    public static void main(String[] args) {
        fib(10);

    }
     public static  void fib( int num){
        int [] arr = new int [num+1];
        arr [0] = 0;
        arr [1] = 1;

         for (int i = 2; i < arr.length ; i++) {
           arr [i] = arr[i-1] + arr[i - 2];

         }
         System.out.println(Arrays.toString(arr));

     }

}
