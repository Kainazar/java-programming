package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        System.out.println("How much is your rent? ");
      Scanner scan = new Scanner (System.in);
      String rent = scan.nextLine();
        scan.nextLine();
      String month =" March ";
        System.out.println("my rent is "+ rent+ " for " + month);
        System.out.println("month = " + month);
        System.out.println("rent = " + rent);

    }
}
