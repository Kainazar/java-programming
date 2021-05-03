package practice_my_self;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Apartment {
    public static void main(String[] args) {
        int numberOfApt = 2;
        double startPrice = 0;
        System.out.println("Welcom to Cybertek Apartment! ");
        System.out.println("Number of bedrooms you are interested: ");
        switch (numberOfApt) {
            case 1:
                System.out.println("One bedroom Selected");
                startPrice = 1100;
                System.out.println("Starting Price: " + startPrice);
                break;
            case 2:
                System.out.println(" Two bedroom Selected");
                startPrice = 1850;
                System.out.println("Starting Price: " + startPrice);
                break;
            case 3:
                System.out.println("Tree bedroom Selected");
                startPrice = 2550;
                System.out.println("Starting Price: " + startPrice);
                break;
            default:
                System.out.println("No such Bedroom available");
        }
    }
}
