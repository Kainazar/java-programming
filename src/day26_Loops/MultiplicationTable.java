package day26_Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 1;
        if (number > 0 || number <= 10) {
            for (int i = 1; i <= 10; i++) {
                int result = (number * i);
                System.out.println(number + " x " + i + " = " + number * i);
                System.out.println(result);
            }

            }else{
                System.out.println("Invalid numbers!");

            }
            }


    }
