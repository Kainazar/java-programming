package day18_conditions_practice_string_intro;

public class CarLeaseTest {
    public static void main(String[] args) {
        String make = "AUDI";
        String model = "Q";
        double leasePrice = 0.0;
        if (make.equals("Audi")){
            if ( model.equals("Q")){
                leasePrice = 475;
            }else if (model.equals("S")){
                leasePrice = 750;
            }else {
                System.out.println("Invalid Make");
            }
            System.out.println("make = " + make);
            System.out.println("model = \"" + model +"\"");
            System.out.println("leasePrice = $" + leasePrice);
            System.out.println("Enjoy your Lease");
        }
        System.out.println("****Thank you Visiting US *****");

    }
}
