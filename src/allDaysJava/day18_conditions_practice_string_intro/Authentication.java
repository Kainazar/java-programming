package allDaysJava.day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4ssn = 1234;
        int expPinCode = 4321;
        int last4SSN = 1234;
        int pinCode = 4444;
        if (last4SSN == expLast4ssn && pinCode == expPinCode) {
            System.out.println(" Authentication successful ");
        } else {
            System.out.println("Authentication unsuccessful ");
            if (last4SSN != expLast4ssn) {
                System.out.println("Last 4 SSN number is incorrect ");
            } else {
                System.out.println();
            }

        }

    }}
