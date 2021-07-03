package allDaysJava.day09_scanner_practice;
import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);  // must be
        System.out.println("******* MILES TO KM CONVERTER********");
        System.out.println("Enter Miles ");
        double miles = scan.nextDouble(); // to scan
        double km = miles * 1.609;

        System.out.println("Km to Ml " + miles * 1.609 +" Kilomerts " );


    }
}
