package OfficeHours.Practice_05_19_21;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
ArrayList <String > list =  new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));
        System.out.println(RemoveLongString2(list, 4));
    }
//    public static ArrayList<String > RemoveLongString(ArrayList<String> list, int mixLength) {
//
//        ArrayList< String > validStrings = new ArrayList<>();
//
//        for (String word : list) {
//            if (word.length() > mixLength) {
//                validStrings.add(word);
//
//            }
//        }
//        return validStrings;
  //  }
    public static ArrayList<String > RemoveLongString2 (ArrayList<String> list, int mixLength) {

     list.removeIf(each -> each.length() < mixLength);
     return  list;
        }
}
