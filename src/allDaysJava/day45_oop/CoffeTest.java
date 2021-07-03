package allDaysJava.day45_oop;

public class CoffeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee() ;
        System.out.println("My Coffee = " +myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("myCoffee.getAmount = " + myCoffee.getAmount());
        myCoffee.drink(40);
        System.out.println("myCoffee after i drink  = " + myCoffee.getAmount());
        myCoffee.setType("Starbucks");
        System.out.println("myCoffee is = " + myCoffee.getType());
        System.out.println(myCoffee.toString());
    }
}
