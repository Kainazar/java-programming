package day09_scanner_practice;
import java.util.Scanner;

public class TempretureF2C {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Convert  F to C ");

        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9; // formula from  F to C.
        System.out.println(c + " C ");


    }
}
