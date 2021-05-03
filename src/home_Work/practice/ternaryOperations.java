package home_Work.practice;
import java.util.*;
import java.util.Scanner;
public class ternaryOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        int count=0;
        for (int i =0; i < word.length(); i++){
            if(word.equals(word.substring(0,3)))
                count++;
            System.out.println(count);
        }



    }
}
