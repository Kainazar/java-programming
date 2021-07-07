package day24_loops;
import java.util.*;
public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 $ ");
        int dollar = scan.nextInt();
        while (dollar!=5){
            System.out.println("BERCHI MAGA  5 SOM");
            dollar = scan.nextInt();

        }
        System.out.println("dollar = " + dollar);
    }
}
