package allDaysJava.day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price for milk:  ");
     double milk = scanner.nextDouble();

        System.out.println(" Enter price for bread; ");
        double bread = scanner.nextDouble();

        System.out.println(" Enter price for cucumber:");
        double cucumber = scanner.nextDouble();

        double total  = milk+bread+cucumber;
        System.out.println("Total you have to pay $ " + total);






    }
}
