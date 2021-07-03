package allDaysJava.day15_logicallops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        String car = " Honda ";
        double carPrice = 4999;
        if (carPrice <= budget &&(car.equals ("Toyota" ) || car.equals("Honda" ) || car.equals("Tesla") )){
            System.out.println("Ready to purchase model = "+ car + carPrice);
        }else {
            System.out.println("Not interested in model");
        }
    }
}
