package day16_switch_ternary;

public class CappucchinoBuyer {
    public static void main(String[] args) {
        String  sizeCoffee = "venti";
        double price = 0.0;
        double calories =0;
        switch (sizeCoffee){
            case "tall":
                System.out.println("Tall cappuccino please ");
                price =4.99;
                calories = 350;
                break;
            case "venti":
                    System.out.println("Venti Cappuccino Please ");
                price =3.99;
                calories = 250;
                break;
            case "Grande":
                System.out.println("grande Cappucchino Please ");
                price =5.99;
                calories = 450;
                break;
            default:
                System.out.println("Regular Coffee Please");
                price =2.49;
                calories = 180;
                break;
        }
        System.out.println(" Total is $ "+ price);
        System.out.println(" Your consume calories "+ calories);
    }
}
