package day14_multi_brach_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        System.out.println("Enter you number ");
       int num1=5;
       int num2= 3;
          char operator ='/';
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


    }
}
