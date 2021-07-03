package allDaysJava.day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        /**     method:
         loginVoid
         params:
         String username, String password

         return type:
         VOID

         in the method:
         Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"

         if(both match)
         PRINT:
         Login Successful, welcome cybertekStudent
         ELSE
         PRINT:
         Incorrect username or password */
        loginVoid("cybertekStudent", "abc123");
        loginVoid("", " ");
        login("cybertekStudent", "abc123");
    }

    public static void loginVoid(String username, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if (secretUserName.equalsIgnoreCase("cybertekStudent") && secretPassword.equals("abc123")) {
            System.out.println("Welcome your account");
        } else {
            System.out.println("Wrong username or password try again.");
        }


        }
    public static boolean login(String username, String password) {

        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equalsIgnoreCase(secretUsername) && password.equalsIgnoreCase(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }
}