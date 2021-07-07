package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {
        // index       0       1         2         3        4           5
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("------- Find THE IndexOf------- 'Gloves in items array-----------");
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
              index = i;
              break;
            }
        }
        System.out.println("index = " + index);

        boolean ipadExits= false;
        for (String str : items) {
            if (str.equalsIgnoreCase("ipad")){
                ipadExits= true;
                break;
            }
        }
        System.out.println("ipadExits = " + ipadExits);
//        [HERE YOU GO I SAW THIS TASK WHEN I WAS READING THE BOOK INTRODUCTION TO JAVA.KEEP THIS CODE IN MIND.THE SOLUTION IS NOT MINE]
//        "
//package day_32;
//import java.util.*;
//        public class WarmUp {
//            public static void main(String[] args) {
//                Random random = new Random();
//                int num [] = {1,2,3,4,5,6};
//
//                for(int i = 0;i < num.length;i++){
//                    int r = random.nextInt(i+1);
//                    int temp = num[i];
//                    num[i] = num[r];
//                    num[r] = temp;
//                }
//                System.out.println(Arrays.toString(num));
//            }
//        }
        System.out.println("-----Print a report of each shopping items-----");

        for (int i = 0; i < items.length; i++) {
            System.out.println("ITEM NAMES: "+ items[i]+"  $"+ prices[i]+ "  #"+ itemIDs[i]);

        }
        System.out.println("============ Look for Jacket ===============");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")){
                System.out.println("Items: " + items[i]+",  $"+  prices[i]+",  #"+  itemIDs[i]);
                break; // stop searching after jacket is found.
            }

        }


    }
}
