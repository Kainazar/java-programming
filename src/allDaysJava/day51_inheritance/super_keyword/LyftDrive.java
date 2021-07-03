package allDaysJava.day51_inheritance.super_keyword;

public class LyftDrive {
    public static void main(String[] args) {

        Lyft taxi = new Lyft();
        System.out.println("taxi.calculateRate(5) = " + taxi.calculateRate(5));


        LiftXL taxi1 = new LiftXL();
        System.out.println("taxi1.calculateRate(5) = " + Math.round(taxi1.calculateRate(5)));

        Lux taxi2 = new Lux();
        System.out.println("taxi2.calculateRate(5) = " + taxi2.calculateRate(5));
    }
}
