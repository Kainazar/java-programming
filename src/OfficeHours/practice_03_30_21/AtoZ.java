package OfficeHours.practice_03_30_21;

import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("Do you want it in ascending or descending order");
        String ascendingOrDescending = input.next();
        int starting;
        int ending;

        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }

        if (ascendingOrDescending.equals("ascending")) {
            for (int i = starting; i <= ending; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i + " ");
            }
        }

    }
}