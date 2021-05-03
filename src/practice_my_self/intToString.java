package practice_my_self;

import java.util.*;

public class intToString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();


        //WRITE YOUT CODE HERE:

        String phoneNumber= Integer.toString(areaCode)+Integer.toString(localNumber);

        System.out.println(phoneNumber);
    }
}
