package OfficeHours.Practice_05_05_21;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LookArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));

//        for(String each : list) {
//            System.out.println(each);
//            if(each.length() == 3) {
//                list.remove(each);
//            }
//        }

        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if(list.get(i).length() == 3) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(list);

        //  "two", "three"
        // i = 0

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Scanner> list4 = new ArrayList<>();

        int [] a = {3,4,1};

        ArrayList<int []> list5 = new ArrayList<>();
        list5.add(a);
        list5.add(new int[]{4,1,4,5,5});

        for(int[] num: list5){
            System.out.println(Arrays.toString(num));
        }

    }

    public static ArrayList<Integer> method1(){
        return new ArrayList<>();
    }

    public static int method2(ArrayList<String> words) {
        return 0;
    }

    public static ArrayList<Integer> method1(ArrayList<String> words) {
        return null;
    }
}
