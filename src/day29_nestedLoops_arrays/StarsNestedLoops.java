package day29_nestedLoops_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {

                System.out.print("* ");
            }

        }
        System.out.println();
        for (int out = 1; out <= 10; out++) {
            for (int k = 0; k <= out; k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int out = 1; out < 10; out++) {
            for (int k = 10; k >= out; k--) {
                System.out.print("* ");

           }
          System.out.println();
            }
        }
    }
