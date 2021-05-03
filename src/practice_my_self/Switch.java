package practice_my_self;

public class Switch {
    public static void main(String[] args) {
        String make  = "toyota";
        String model = "highlander";
        double  price = 0;
       double year;
        switch( make){
            case "toyota":
                price = 17500;
                year = 2015;
                model = "highlander";
                break;
            case "lexus":
                price = 32500;
                year = 2017;
                model = "gx";
                break;
            case "bmw":
                price = 24000;
                year = 2018;
                model = "M";
                break;
                case "Honda":
                  price = 16200;
                  year = 2019;
                  model = "Xl";
                  break;
            default:
                make = "Invalid name";
                year = 0;
                model = "Invalid model";
        }
        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("price = " + price);
        System.out.println("year = " + year);
    }
}
