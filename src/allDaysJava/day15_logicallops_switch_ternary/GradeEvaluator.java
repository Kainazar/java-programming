package allDaysJava.day15_logicallops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'a';
        if ( grade =='A' || grade =='a' || grade =='B' || grade == 'C'){
            System.out.println("Passed With Grade " + "\""+grade+"\"");
        } else if ( grade == 'D' ){
            System.out.println("Quality for retake Grade is " + "\""+grade+"\"");
        }else if ( grade == 'E'){
            System.out.println("Fail Grade is " +"\""+grade+"\"");
        }else {
            System.out.println("Come back again");
        }

    }
}
