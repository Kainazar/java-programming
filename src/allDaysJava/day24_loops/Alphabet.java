package allDaysJava.day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println(" ");

        while (letter <= 'Z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        char letter1 = 'Z';
        System.out.println(" ");

        while (letter1 >= 'A') {
            System.out.print(letter1 + " ");
            letter1--;

        }
        System.out.println();
    }
}
