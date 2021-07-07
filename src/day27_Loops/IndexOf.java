package day27_Loops;

public class IndexOf {
    public static void main(String[] args) {
        String word = "gitghub";
        char letter = 'h';
        int index = -1;

        for(int n = 0; n < word.length(); n++) {
            // System.out.println(n +" - " + word.charAt(n));
            if (word.charAt(n) == letter) {
                index = n;
                System.out.println(letter +" is found at index " + index);
                break; //exit for loop
            }
        }

        if(index == -1) {
            System.out.println(letter + " is not present");
        }
        else{
            System.out.println(letter +" is found at index " + index);
        }
    }
}
