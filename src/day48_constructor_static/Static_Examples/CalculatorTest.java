package day48_constructor_static.Static_Examples;

public class CalculatorTest {
    public static void main(String[] args) {
        // add is static method , can be called using className. static MethodName;
        Calculator.add(5,3);


        // Calculator.multiply(2,4);      ***** Error it is NOT static ****
        Calculator calculator = new Calculator();
        calculator.multiply(5, 5);
    }
}
