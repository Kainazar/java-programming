package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed ");
        int currentLimit = scan.nextInt();
        System.out.println("Speed Limit is 55 MPH! ");
        System.out.println();
        byte speedLimit = 55;
        int overTheLimit = currentLimit - speedLimit;
        System.out.println("You are driving " + overTheLimit + " mph over the limit. Slow Down !\n Be Safe and Enjoy Your Weekend ");

    }
}
