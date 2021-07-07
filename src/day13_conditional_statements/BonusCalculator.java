package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 40;
        double salesAmount = 2000.55;

        if (salesAmount <= 2000) {
            bonus = 100;
            System.out.println("Good Job, You Are Qualified For Bonus: $" + bonus);

        } else {
            bonus = 50;
            System.out.println(" Good Job, You Are Qualified For Bonus: $" + bonus);
        }
        System.out.println(" Your Total bonus: " + bonus);
        System.out.println(" YOU ARE GOOD WORKER\n THANK YOU SEE YOU ");
    }
}