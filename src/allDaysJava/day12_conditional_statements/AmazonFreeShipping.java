package allDaysJava.day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        System.out.println("enter total price? ");
       Scanner scan = new Scanner(System.in);
       double price1= scan.nextDouble();
       if(price1> 25.0){
           System.out.println("Thank you for purchase and you got free shipping " );

       }else{
           System.out.println("Not eligible to free shipping " + price1);
       }


    }
}
