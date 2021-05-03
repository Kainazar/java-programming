package practice_my_self;
import java.util.*;
public class StarsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int out = 0; out <= n; out++) {
            for (int k = 0; k <= out; k++) {
                System.out.println();
            }
            System.out.println(n);
        }
    }
}


