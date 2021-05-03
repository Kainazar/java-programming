package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed= 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed>speedLimit;
        System.out.println(" Are you speeding? - "+ isSpeeding);
        System.out.println(currentSpeed==speedLimit);
        currentSpeed+=20;
        System.out.println(" Are you speeding? - "+ isSpeeding);
        System.out.println(currentSpeed);
        System.out.println();

       double accountBalance = 250.25;
       double itemPrice =200.99;
        System.out.println("can i afford ? " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can Afford = " + canAfford);
        accountBalance -=itemPrice;
      boolean isbroke = accountBalance <= 0;
      System.out.println("Am i broke ? "+ isbroke);


    }
}
