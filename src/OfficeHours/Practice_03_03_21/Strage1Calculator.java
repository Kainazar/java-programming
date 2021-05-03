package OfficeHours.Practice_03_03_21;
/* Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..*/

public class Strage1Calculator {
    public static void main(String[] args) {
        double numOne = 3.0;
        double numTwo = 10.0;
        double addition = numOne + numTwo;
        double subtraction = numOne - numTwo;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;
        System.out.println("Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo+ " = " + addition);
        System.out.println(numOne + " - " + numTwo+ " = " + subtraction);
        System.out.println(numOne + " / " + numTwo+ " = " + division);
        System.out.println(numOne + " % " + numTwo+ " = " + remainder);
        System.out.println(numOne + " * " + numTwo+ " = " + multiplication);

        System.out.println();
        System.out.println();

        // print without variables

        System.out.println("Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo+ " = " + (numOne + numTwo));
        System.out.println(numOne + " - " + numTwo+ " = " + (numOne - numTwo));
        System.out.println(numOne + " / " + numTwo+ " = " + (numOne / numTwo));
        System.out.println(numOne + " % " + numTwo+ " = " + (numOne % numTwo));
        System.out.println(numOne + " * " + numTwo+ " = " + (numOne * numTwo));


    }
}
