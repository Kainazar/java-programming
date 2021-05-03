package OfficeHours.Practice_03_10_21;
import java.util.Scanner;
public class BakingContast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge = " + judge++ + "score");
        int scoreOne = scan.nextInt();
        System.out.println("Enter judge = " + judge++ + "score");
        int scoreRwo = scan.nextInt();
        System.out.println("Enter judge = " + judge++ + "score");
        int scoreTree = scan.nextInt();
        System.out.println("Enter other person 1's score");
        int otherPerson1 = scan.nextInt();
        System.out.println("Enter other person 2's score");
        int otherPerson2 = scan.nextInt();
        int ourAverageScore = (scoreOne + scoreRwo + scoreTree) / 3;
        if (ourAverageScore > otherPerson1 && ourAverageScore > otherPerson2) {
            System.out.println("First Place ");
        }
    }
}
