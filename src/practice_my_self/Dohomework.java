package practice_my_self;
import java.util.*;
public class Dohomework {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSerniorCitizens:");
        int senior=scan.nextInt();
        int nonSenior=scan.nextInt();
        System.out.println("What is new citizen's age?");
        int age=scan.nextInt();
        if (age>=65){
            senior = senior++;
            System.out.println("Senior Citizen");
        }else if (age<65){
            nonSenior = nonSenior++;
            System.out.println("Non-Senior Citizen ");
        }
        System.out.println("New seniorCitizens count "+ senior);
        System.out.println("New nonSeniorCitizens count "+nonSenior);


        }

        }





