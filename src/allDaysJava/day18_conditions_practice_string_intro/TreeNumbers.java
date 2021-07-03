package allDaysJava.day18_conditions_practice_string_intro;

public class TreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 44;
        int num3 =11;
        if (num1 > num2 && num1 > num3 ){
            System.out.println(num1 + " Print value");
        } else if ( num1 < num3 ){
            System.out.println(num2 +"Middle value");
        } else if ( num3 == num1){
            System.out.println(num3 + "not equal");
        }
    }

}
