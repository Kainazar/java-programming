package allDaysJava.day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull= 3;
        while (isHungry){
            bananas++;
            System.out.println("eat "+bananas);
// isHungry = bananas == countToFull? false :true; we can use ternary!.
if ( bananas==countToFull){
    isHungry= false;
}
        }
        System.out.println("I have ate "+ bananas+ " for Today");
    }
}
