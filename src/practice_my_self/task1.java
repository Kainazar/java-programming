package practice_my_self;
import java.util.*;
public class task1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int indOfUnder = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfDomain= email.indexOf(".");

        String firstName = email.substring(0,indOfUnder);
        String cpFirstName = firstName.substring(0,1).toUpperCase();
        String lastName = email.substring(++indOfUnder,indexOfAt);
        String cpLasName = lastName.substring(0,1).toUpperCase();
        String domain =email.substring(++indexOfAt,indexOfDomain);

        System.out.println("First name: " + cpFirstName+firstName.substring(1));
        System.out.println("last name: "+ cpLasName+lastName.substring(1));
        System.out.println("Domain: " + domain);

        }

    }

