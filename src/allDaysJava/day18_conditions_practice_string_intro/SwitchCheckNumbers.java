package allDaysJava.day18_conditions_practice_string_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        switch(num1) {
            case 10:
                num1++;
                num2+=10;
                break;
            case 20:
                num1+=num2;
                num2--;
            case 30:
                num1 = 0;
                num2 -= 3;
                break;
        }
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);
    }
}
