package allDaysJava.day18_conditions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 60;
        if ( score >= 1 && score <= 40 ){
            System.out.println(" range is  D");
        }else if ( score > 40 && score <= 60 ){
            System.out.println( "range is C ");
        }else if ( score > 60 && score <= 90 ){
            System.out.println(" range is B");
        }else if ( score >90 && score <= 100){
            System.out.println("range is A");
//        }else if ( score <= 0 || score > 100){
//           System.out.println("Invalid score ");

//        }

        }else {
            System.out.println("Invalid score");
        }
    }
}
