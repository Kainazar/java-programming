package OfficeHours.Practice_03_03_21.Practice03_24_21;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber = "5000000";

        if (accountNumber.startsWith("2")) { // if(accountNumber.charAt(0) == '2')

            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Not a valid 7 digit account number");
            }

        } else if (accountNumber.startsWith("5")) {

            if (accountNumber.length() == 10) {
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("Not a valid 10 digit account number");
            }

        } else {
            System.out.println("Not a valid account number");
        }
    }
}
