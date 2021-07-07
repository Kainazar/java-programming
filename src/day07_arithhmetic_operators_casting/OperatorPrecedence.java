package day07_arithhmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println(10 + 5 - 3);  //answer 12
        System.out.println(10 - 5 + 3);   // answer 8
        System.out.println(10 - (5 + 3)); // answer 2
        System.out.println(2 * 3);// 6.
        System.out.println(2 * 3 / 3);  // answer 2
        System.out.println(20 / (2 * 2)); // answer 20 / 4 -> 5
        //System.out.println( 10 / 0); // error while running
        System.out.println( 2 + 5 * 3); //first 5*3
        System.out.println( (2 + 5) * 3);

        System.out.println( 10 / 3 );  // 3
        System.out.println( 5 / 2);    // 2

        System.out.println( 10.0 / 3.0); ///3.33333333.
        System.out.println( 5.0 / 2.0);  // 2.5



    }
}
