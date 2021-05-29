package OfficeHours.Practice_05_18_21;

import java.util.Arrays;

public class Mutability {
    public static void main(String[] args) {
        String one = "java";
        String two = one;
        String three = two.toUpperCase();
        System.out.println(three);

        System.out.println(two.toUpperCase() == three);

        one = one.substring(2);
        System.out.println(one);
        System.out.println(two);


        String a = new String("anything");
        String b = a;

        b = b.toUpperCase();
        System.out.println("a " + a);
        System.out.println("b " + b);

        int [] arr = {1,2,3};
        int [] arr2 = arr;
        arr2[0] = 100;
        arr[1] = 200;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
