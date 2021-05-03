package day35_method_tiwh_param;
import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 doubles");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        showSum(d1,d2);

    }
    public static void showSum(double num1, double num2){
        double sum = num1+num2;
        System.out.println("sum = " + sum);
    }
}
