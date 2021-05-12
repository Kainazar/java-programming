package OfficeHours.Practice_05_02_21;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("apples", "tree","loop", "cat", "animal", "shortcut"));

        ArrayList<String>list2 = new ArrayList<>();

        for (String each : list){
            if (each.length()<= 4){
                list2.add(each);
            }

        }
        System.out.println(list2);
    }
}
