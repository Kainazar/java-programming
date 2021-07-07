package day18_conditions_practice_string_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int  number=  5;
        if (number>0){
            System.out.println("Positive");
        }else if (number < 0){
            System.out.println("negative");
        }else {
            System.out.println("zero");
        }
    }
}
