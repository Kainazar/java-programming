package day28_loops;

//import java.util.Random;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz";
        Random random = new Random();
        String password = "";
        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(51);

            System.out.print(source.charAt(index));
            password+=source.charAt(index);


        }
        System.out.println("\nYour password is: "+ password);

    }
}
