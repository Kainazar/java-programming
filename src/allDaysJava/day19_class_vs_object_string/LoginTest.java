package allDaysJava.day19_class_vs_object_string;

import java.util.Locale;

public class LoginTest {
    public static void main(String[] args) {
        String exUserName = "Cybertek";
        String expPassword = "Abc 123";
        String userName = "Cybertek123";
        String password = "abc1234";
        if (exUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println(" pass -user logged in successfully");
        } else {
            if (!(exUserName.equalsIgnoreCase(userName))) {
                System.out.println(" fail Incorrect Username");
            } else {
                System.out.println("fail incorrect password");
            }

        }
        String word = "Java";
        System.out.println(word.toUpperCase(Locale.ROOT));
        System.out.println(word.toLowerCase(Locale.ROOT));

        float f1 = (12_435.1 > 123_45.0) ? 12_456 : 124_56.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);


    }
}
