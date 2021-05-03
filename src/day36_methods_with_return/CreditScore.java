package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
checkEligible(750);
checkEligible(699);
      //  System.out.println(checkEligible(750););   ERROR
        System.out.println(getCreditScore());
        System.out.println("getCreditScore() = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);
    }
    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing this car!");
        } else {
            System.out.println("Sorry, you not eligible!!!");
        }
    }
    public static int getCreditScore(){
        return 850;
    }
}


