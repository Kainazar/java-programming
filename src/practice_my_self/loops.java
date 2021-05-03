package practice_my_self;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(str.indexOf("code"));
        int i=0;

        if (str.indexOf("code") > -1) {
            System.out.println("found");

        } if(str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e'){

       // else if (str.indexOf("code") < -1) {
            System.out.println("Not found");
            //}else if(keyboard.charAt('d')+));
        }
    }
}
