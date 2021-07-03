package allDaysJava.day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A'; char letter2 = 'J';

       System.out.println(letter1 == letter2); // false
       System.out.println(letter1  > letter2); // false
        System.out.println(letter2 < letter1); // false

        char grade = 'A';
        boolean paas = grade <= 'D';
        System.out.println("Did you paas the exam ?  " + paas);

    }
}
