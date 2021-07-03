package allDaysJava.day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Add: 10 + 45 = "+ Calculator.add(10, 45));
        System.out.println("Minus: 45 - 10 = "+ Calculator.minus(45,10));
        System.out.println("Divide: 50 / 5 = "+ Calculator.divide(50,5));
        System.out.println("Multiply: 50 * 50 = "+ Calculator.multiply(50,50));
        double num1 = 234.3;
        double num2 = 321.5;
        double sum = Calculator.multiply(num1, num2);
        System.out.println("sum = " + sum);

    }
    }

