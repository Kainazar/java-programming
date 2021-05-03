package home_Work.practice;
import java.util.*;
public class aAndToz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Lower or Upper letter");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Lower")){
            for( char i = 'a'; i<= 'z'; i++){
                System.out.print(i+" ");
            }

        }else if (answer.equalsIgnoreCase("Upper")){
            for (char i ='A'; i <= 'Z';i++){
                System.out.print(i+" ");
            }
        }


    }



}
