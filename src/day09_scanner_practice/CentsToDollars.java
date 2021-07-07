package day09_scanner_practice;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
         /* Scanner scan = new Scanner (System.in);
        System.out.println("Enter Cents ");
        int cents = scan.nextInt();
        int dollar = cents / 100;
        int remainCents =  cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollar = " + dollar);
        System.out.println("remainCents = " + remainCents);
        // in 597 : 5 dollar 97cents.
        System.out.println("In "+ cents + " cents: " + dollar+ " dollars "+ remainCents + " cents");*/
        Scanner scan  = new Scanner (System.in);
        System.out.println(" minute to second");
        double second =  scan.nextDouble();
        double minute = 1 * 60;
        double hours = minute / 60;
        System.out.println("minute = " + second);;
        System.out.println("second = " + hours);

 }
}
