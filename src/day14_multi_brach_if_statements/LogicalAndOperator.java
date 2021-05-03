package day14_multi_brach_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println (true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false &&false); // false

        System.out.println(10 > 5 && 1 == 1); // true + true = true. 10 greater then 5, 1=1
        System.out.println(99<100 && 22 > 25); // false
        System.out.println(3 > 2 && 5 > 2); // true
        System.out.println(10 > 15 && 5 > 10); // false


        int apples = 10;
        int oranges = 5;
        boolean check = 10 >5 && oranges >3;
        System.out.println();

    }
}
