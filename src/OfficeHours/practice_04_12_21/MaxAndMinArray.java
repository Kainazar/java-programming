package OfficeHours.practice_04_12_21;

import java.util.Arrays;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 500, -3, -10, 4, 3};
        int min = arr[0];
        int max = arr[0];

        for (int each : arr) {
            // each -> every element | for loop: arr[i]

            if (each < min) {
                min = each;
            }

            if (each > max) {
                max = each;
            }

        }

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);

        // ------------------------

//        int [] arr = {3,1,500,-3,-10,4,3};
//        int min = arr[0];
//        int max = arr[0];
//
//        for(int i =0; i < arr.length; i++) {
//            // each -> every element | for loop: arr[i]
//
//            if(arr[i] < min) {
//                min = arr[i];
//            }
//
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//
//        }
//
//        System.out.println("MIN: " + min);
//        System.out.println("MAX: " + max);
    }
}