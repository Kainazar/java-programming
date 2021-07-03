package allDaysJava.day10_shorthand_operators;
//import java.util.Scanner;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
         count = count + 2;
        System.out.println("count = " + count);
        int apples = 5;
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);
        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2 + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        System.out.println("players = " + players);
       players= players * 2;
        System.out.println("players = " + players);
        System.out.println();
        System.out.println();








        int cents = 789;
        cents = cents % 100;
        int dollars = cents/100;
        System.out.println("remaining cents  = " + cents);
        System.out.println("dollars = " + dollars);
        








    }
}
