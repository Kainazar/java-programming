package day13_conditional_statements;


public class myPractice {
    public static void main(String[] args) {

        int a = 5; // 5
        int b = a++ + a-- + a * 2 + a + ++a;
        int total = a+b;
        System.out.println(a);
       System.out.println(b);

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        System.out.println("x=" + x);
        System.out.println("y=" +y);
        System.out.println("z="+ z);
        System.out.println();
        System.out.println();

       // int a = 200;
       // int b = -a++ + - --a * a-- % 2 + a;
       // System.out.println("a=" +a);
       // System.out.println("b=" +b);

   int number =65;
       if(number<=45) {
           System.out.println("Eligible vote for president");
           number= 45-65;
       }
        if (number<=18) {
            System.out.println("Eligible to vote");
            number=18-45;
        }else {
            System.out.println("You are not eligible for vote");
            number= 18;
        }




    }
}