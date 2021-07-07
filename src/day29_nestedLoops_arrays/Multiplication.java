package day29_nestedLoops_arrays;

public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for( int iner = 1; iner <=10; iner++){
                System.out.print(i+ " x " +iner+ " = " +(i * iner) + "\t\t");
            }
            System.out.println();

        }
        String word = "Java";
        for (int i = 0; i <word.length() ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j));

            }
            System.out.println();

        }
    }
}
