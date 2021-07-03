package allDaysJava.day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = " + nums);
        // nums.add(100);  UnsupportedOperationException
        // nums.remove(0); UnsupportedOperationException
        // nums.clear();  UnsupportedOperationException

        // The reason for UnsupportedOperationException is when we use Arrays.asList it will return immutable list, that size cannot be modified.
        // but we can do any other operations on it
        System.out.println("nums = " + nums);

        List<Integer> num1 = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        System.out.println("num1 = " + num1);
        num1.add(33);
        num1.add(56);
        num1.remove(0); // This is IndexOf
        num1.remove(new Integer(5344));
        System.out.println("num1 = " + num1);

        /**
         * List String drinksWithCoffeine --> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha;
         */

        int coffeineAmount = 0;
        List<String> drinksWithCoffe = new ArrayList<>(Arrays.asList("coffee", "tea", "celsius",
                "monster", "red bull", "coke", "pepsi", "kambucha", "mdew"));

        for (String each : drinksWithCoffe) {

            if (each.equals("monster") || each.equals("red bull") || each.equals("celsius")) {
                coffeineAmount = 150;
                System.out.println(each + " has " + coffeineAmount + " caffeine amount");

            } else if (each.equals("coffee") || each.equals("kabucha")) {
                coffeineAmount = 100;
                System.out.println(each + " has " + coffeineAmount + " caffeine amount");

            } else if (each.equals("tea") || each.equals("coke") ||
                    each.equals("pepsi") || each.equals("mdew")) {
                coffeineAmount = 35;
                System.out.println(each + " has " + coffeineAmount + " caffeine amount");


                switch (each) {
                    case "monster":
                    case "red bull":
                    case "celsius":
                        coffeineAmount = 150;
                        System.out.println(each + " has " + coffeineAmount + " caffeine amount");
                        break;
                    case "coffe":
                    case "kabucha":
                        coffeineAmount = 100;
                        System.out.println(each + " has " + coffeineAmount + " caffeine amount");
                        break;
                    case "tea":
                    case "coke":
                    case "pepsi":
                    case "mdew":
                        coffeineAmount = 35;
                        System.out.println(each + " has " + coffeineAmount + " caffeine amount");

                }

            }


        }
        drinksWithCoffe.forEach(each -> System.out.println(each.toUpperCase()));
        drinksWithCoffe.forEach(each -> {
            System.out.println("*******************************");
            System.out.println("each = " + each);
        });
    }
}





