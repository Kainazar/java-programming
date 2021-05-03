package OfficeHours.Practice_03_10_21;

public class ExamplesIf {
    public static void main(String[] args) {
        int a = 10;
         int b = a-- * 2 - --a % 2 +a;

         //       10 * 2 - 8 & 2 +8
        //        20 - 8 % 2 +8
        //        20 - 0 + 8
        // answer 28
        System.out.println(b);


        // 8% 2 = 0
        // 8/2 = 4
        // 9%2=1
        // 9/2 => 2+2+2+2=8

        // 2 % 7 = always reminder is lower number reminder is
         // 7 % 2 = does not work
    }
}
