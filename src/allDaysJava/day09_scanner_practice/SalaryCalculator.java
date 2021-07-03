package allDaysJava.day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourly = scan.nextDouble();
        double weekly = hourly * 45;
        double monthly = weekly * 52 /12;
        double annualPay = monthly *12;
        double taxes = 8.75;
        System.out.println("Weekly Pay: " + weekly);
        System.out.println("Monthly Pay: " + monthly);
        System.out.println("Annual Pay: " + annualPay);
        System.out.println("Taxes will charge from your " + weekly);







    }
}
