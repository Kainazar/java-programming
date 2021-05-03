package practice_my_self;
import java.util.Scanner;
public class SaimTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with");
        int people = scan.nextInt();
        if (people <= 2) {
            System.out.println(" Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("Live with 3-6");
            System.out.println("That's cool!!! ");
        } else if (people >= 6) {
            System.out.println(" Live with more than 6 people");
        }
        System.out.println("What city do you live in? ");
        String city = scan.next();
        System.out.println("Do you live in downtown?");
        String downtown = scan.next();
        if (downtown.equals("Yes ")) {
            System.out.println("Have you thought about moving to the suburbs ? yes or no ");
            String moving = scan.next();
            if (moving.equals("Yes")) {
            }
        }
        System.out.println("that's great!");
        System.out.println("Do you have animals?");
        String animal = scan.next();
        if (animal.equals("Yes i have dog")) {
            System.out.println("Wow dog is a great animal");
        }
        System.out.println();
        System.out.println("how many pets they want?");
        byte pets = scan.nextByte();
        System.out.println(" Interesting, do you want " + pets + " number of pets and favorite animal? ");
        System.out.println("nice to see you!");
        System.out.println("thank you have a good day!");

    }
}
