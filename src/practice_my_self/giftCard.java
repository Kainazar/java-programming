package practice_my_self;
import java.util.Scanner;
public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int giftCard = scan.nextInt();
        int leftOver = 0;
        int price = 0;
        int item =5;

        if (giftCard<item){
            System.out.println("Invalid item!");
        }
    }
}
