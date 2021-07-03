package allDaysJava.day29_nestedLoops_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {


        for (int min = 1; min <= 5; min++) {
            System.out.println(" \nmin = " + min);

            for (int sec = 1; sec <= 60; sec++) {
                System.out.print(sec+ " ");
            }
        }
        for (int min = 0; min <= 5 ; min++) {
           // System.out.println("min = " + min);
            for (int sec = 0; sec <=60; sec++) {
                System.out.println(min+":"+sec);
            }

        }
    }
}

