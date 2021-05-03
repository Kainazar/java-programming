
package day14_multi_brach_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you number ");
        double num1=scanner.nextDouble();;
        double num2= scanner.nextDouble();;
        System.out.println("Enter operator: -, +, *, /");
        char operator = scanner.next().charAt(0);
        if(operator == '+') {
            System.out.println(num1 + num2);
        } if(operator == '-'){
            System.out.println(num1 - num2);
        }else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if(operator=='/' ){
            System.out.println(num1 % num2);
        }else{
            System.out.println(" No valid operator ");
        }

        System.out.println(num1);
        System.out.println(num2);
    }
}
