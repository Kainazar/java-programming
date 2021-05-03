package practice_my_self;
import java.util.Scanner;
public class replR { //
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int quarters = cents / 25;
        int dime = (cents % 25 )/10;
        int nickels =((cents % 25) % 10) / 5;
        int pennies = cents % 25 % 10 % 5;
        if ( cents > 0 && cents <= 100){
            System.out.println("Your change is "+ quarters + " quarters, " + dime + " dime, " + nickels + " nickles, " + pennies + " pennies. ");
        } else {
            System.out.println("invalid cents amount ");
        }



    }

}
