package day17_ternary_nested_conditions;

//import java.util.Scanner;
public class TernaryExamples {
    public static void main(String[] args) {
        int score = 90;
        String quality = "good";
        String result = (score>60)? "pass" : "fail";
        int x = (quality.equals("good")) ? 100 : 0;
        char grade = (score>90) ? 'A' : 'B';
        String evenOrOdd = (score % 2==0) ? "even" : "odd";
        System.out.println(result);
        // with ternary:

        int score1 = 75;
        String result1 = ( score > 80) ?  "Pass" : "Fail";
        System.out.println("result1 = " + result1);

        String quality1 = "bad";
        System.out.println(quality.equals( "good") ? 100 : 0);
        int rating = quality.equals("good") ? 100: 0;
        System.out.println("rating = " + rating);

        int score3 = 100;
        char grade1  = (score3 > 90 ) ? 'A': 'B';
        System.out.println("grade1 = " + grade1);
       // if (score >90){
          //  grade1 = 'A';
          //  else {
              //  grade1 = 'B';

              // System.out.println("grade1 = " + grade1);
           // }
       // }


}
}

