package allDaysJava.day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedroom = 2;
        double price = 0;
        double sizeBedRoom = 0;
        switch (numberOfBedroom){
            case 1:
                System.out.println(" One bedroom apartment selection");
                price = 1454;
                sizeBedRoom= 750;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                price = 2899;
                sizeBedRoom = 1100;
                break;
            case 0 :
                System.out.println(" Studio apartment selected");
                price = 1350;
                sizeBedRoom= 600;
                break;
            default:
                System.out.println("we can look another apartment for you");
                break;
        }
        System.out.println("Your monthly rent is $ "+ price + " \nTotal of sq is "+ sizeBedRoom);
        System.out.println("Enjoy in our apartments");
        System.out.println("Our apartment starts with " + price);


    }

}
