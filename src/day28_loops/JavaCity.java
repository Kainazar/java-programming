package day28_loops;

public class JavaCity {
    public static void main(String[] args) {
       int totalCase = 0;

        for (int day = 1; day <=30; day++) {
            if(day % 7 == 0) {
                totalCase += 500;

            }else {
                totalCase += 200;

            }
            System.out.println("Day " + day +"| totalCases "+totalCase);
        }
        System.out.println("Java City 03/2021 cases: "+ totalCase);
    }
}
