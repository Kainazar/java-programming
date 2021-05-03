package OfficeHours.practice_03_31_21;

public class CountUpperLowerOrNumber {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase = 0, number = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i); // 2 -> ascii: 50

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;
            } else if (eachLetter >= '0' && eachLetter <= '9') { // 48 - 57
                number++;
            }

        }

        System.out.println("uppercase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);
    }
}