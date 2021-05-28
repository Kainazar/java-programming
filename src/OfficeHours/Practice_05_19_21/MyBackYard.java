package OfficeHours.Practice_05_19_21;

public class MyBackYard {
    public static void main(String[] args) {
        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();
        // birdOne.canFly; -> don't compile
        birdOne.setFly(true);
        System.out.println(birdOne.isFly());
        birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());
    }
}
