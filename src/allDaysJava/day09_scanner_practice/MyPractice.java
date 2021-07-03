package allDaysJava.day09_scanner_practice;
import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double item1 = scan.nextDouble();
        double item2 = 3.50;
        double item3 = 4.50;
        double total = item1 + item2 + item3;
        System.out.println(total);
    }
}
