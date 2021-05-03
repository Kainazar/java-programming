package day18_conditions_practice_string_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 19;
        if (number % 3 == 0 && number % 5==0) {
            System.out.println("fizzbuzz");
        }else if ( number % 3 == 0 ){
            System.out.println("fizz");

        }else if ( number % 5 == 0){
            System.out.println(" buzz ");
        }else {
            System.out.println(number);
        }
    }
}
