package allDaysJava.day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {

        System.out.println("**** Welcome to TD bank ****");
        int secretPincode = 2005;
        int inputPincode = 2005;
        if (secretPincode == inputPincode){
        System.out.println(" welcome to your account ");
        System.out.println( "How can i help you ");
        }
        else{
        System.out.println(" Sorry wrong pin code \n Try Again ");

    }
        System.out.println("Thank you for using TD BANK");

}
}