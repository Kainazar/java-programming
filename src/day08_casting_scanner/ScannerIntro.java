package day08_casting_scanner;
 import java.util.Scanner;


public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("PLEASE ENTER YOUR NAME");

        String firstName = scan.next();

        System.out.println("Nice to meet you. " + firstName);



    }
}
