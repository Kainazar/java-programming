package OfficeHours.Practice_03_03_21;

public class saim_task {

    public static void main(String[] args) {
        int levelOfOxygen = 90;
        System.out.println("******* Welcome to Ocean ******");
        System.out.println();
        if (levelOfOxygen >= 90) {
            System.out.println("Your tank is full");
        }else if (levelOfOxygen >= 80) {
            System.out.println("Still okay");
        } else if (levelOfOxygen >= 70) {
            System.out.println("Don't go too far");
        } else if (levelOfOxygen >= 60) {
            System.out.println("Start to head back");
        } else if (levelOfOxygen >= 50) {
            System.out.println("Be care now you at 50%");
        }System.out.println();
        System.out.println("***** Enjoy with your diving ****");
    }

}
