package home_Work.practice;
import java.util.*;
public class saperateEmails {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String email = input.nextLine();

                //Write your code below
                String [] word = email.split("");
                if(email.contains("@")){
                    System.out.println(email.substring(0,4));
                    System.out.println(email.substring((5)));
                }else {
                    System.out.println("Invalid email");
                }
            }
        }




