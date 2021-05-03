package home_Work.practice;
import java.util.*;
public class AtoZ {
    public static void main(String[] args) {
     String word = "civic";
       // for (int i = word.length(); i > 0; i--) {
           // System.out.println(""+i);

        System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        String word2 = ""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);
        if (word.equalsIgnoreCase(word2)){
            System.out.println("true");
        }else
        {
            System.out.println("false");
            
            int eveNumber= 0;
            int oddNumber = 0;
            for (int i = 0; i < 100; i++) {
                if (eveNumber % 2 == 0){
                    eveNumber+=i;
                }
                else{
                    oddNumber+=i;
                }
                
            }
            System.out.println("eveNumber = " + eveNumber);
            System.out.println("oddNumber = " + oddNumber);
        }
        

        }






    }

