package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(175,150));
        System.out.println("add = " + add(15,15));
        System.out.println("minus: = " + minus(10,8));
        System.out.println("divide: = " + divide(25,5));
        System.out.println("multiply: = " + multiply(15,15));
    }
    public static double add (double num1, double num2){
        double sum = num1 + num2;
        return sum;
    }
    public  static double minus(double num1, double num2){
        double sum = num1 - num2;
        return sum;
    }
    public static double divide( double num1, double num2){
        double sum = num1 / num2;
        return sum;
    }
    public static double multiply(double num1, double num2){
        double sum = num1 * num2;
        return sum;
    }
    
    
}
