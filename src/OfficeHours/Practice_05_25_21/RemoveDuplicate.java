package OfficeHours.Practice_05_25_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {
     /*
    This method will take an ArrayList of numbers and remove any duplicates values. The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers @return - ArrayList of numbers
    Ex:
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9, 2, 9, 9, 9, 8));
        System.out.println(removeDup(list));
        System.out.println(removeDup2(list));
    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list){

        ArrayList<Integer> uniques = new ArrayList<>();
        String checked = "";

        for(int i=0; i < list.size(); i++) {
            int count = 0;

            if(!checked.contains("" + list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }

                if (count == 1) {
                    uniques.add(list.get(i));
                }

                checked += list.get(i) + " ";

            }

        }

        return uniques;
    }


    public static ArrayList<Integer> removeDup2(ArrayList<Integer> list) {
        list.removeIf( e -> Collections.frequency(list, e) > 1);
        return list;
    }

}


