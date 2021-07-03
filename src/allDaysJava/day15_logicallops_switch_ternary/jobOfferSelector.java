package allDaysJava.day15_logicallops_switch_ternary;

public class jobOfferSelector {
    public static void main(String[] args) {
       double salary = 110_000;
       boolean isRemote = true;
       boolean isBenefits = true;
       String location = "California";
       if (location.equals("California") && salary >= 110_000 && isRemote &&isBenefits){
           System.out.println("sure ,  I accept this Offer ");
    } else {
           System.out.println(" let's discuss some offer or negotiate ");
       }
        System.out.println("Thank you for coming !");
       }
}
