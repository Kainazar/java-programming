package OfficeHours.Practice_04_19_21;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int [] a = gerRandomIntArray(5, 50);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(gerRandomIntArray(10, 100)));
    }
    public static int [] gerRandomIntArray(int size, int maxRandomNumber){

        Random random = new Random();
        int [] arr = new int [size];
        for (int i = 0; i < size ; i++) {
            arr[i] = random.nextInt(maxRandomNumber+1);

        }
        return arr;

    }



}
