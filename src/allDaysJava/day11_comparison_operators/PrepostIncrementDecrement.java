package allDaysJava.day11_comparison_operators;

public class PrepostIncrementDecrement {

    public static void main(String[] args) {
        // pre-increment
        int num1= 10;
        int num2= ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // post -increment
        int num3 = 8;
        int num4 =num3;
        num3++; // add 1.
        System.out.println("num3 = " + num3); //9
        System.out.println("num4 = " + num4); //8

        int apples = 5;
        int basket = apples++;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);
        
        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwiBasket = " + kiwiBasket);
        
        int cars = 5;
        System.out.println(++cars);
        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);
        System.out.println();
        System.out.println();

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);



    }
}
