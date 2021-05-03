package OfficeHours.Practice_03_10_21;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if (email.contains("_")) {
            int underscore = email.indexOf("_");
            int at = email.indexOf("@");

            String firstName = email.substring(0, underscore);
            String lastName = email.substring(underscore+1, at);
            String remaining = email.substring(at);

            System.out.println(lastName + "_" + firstName + remaining);
        } else {
            System.out.println(email);
        }


    }
}


