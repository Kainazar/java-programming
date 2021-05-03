package day15_logicallops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        // != not sure
        // !true= false
        // ! false = true.
        System.out.println("!true = " + (!true));
        System.out.println(" !false = " + (!false));

        int age = 8;
        if (!(age > 5)) {
            System.out.println("Need to sit in child car seat at." + age);
        } else {
            System.out.println("Cam seat normal seat. age  = " + age);
        }
        boolean isSmokingAllowed = true;
        if (!(isSmokingAllowed)) {
            System.out.println("Smoking is not allowed here. Exit ");
        } else {
            System.out.println("Exit is there, Thank you");

            boolean isAffordable = true;
            if(!( isAffordable)){
                System.out.println("Item not affordable" );
            }else {
                System.out.println(" Is afforadable");
            }
            String env = "qa";
            if (env.equals( ("qa"))){
                System.out.println("IN wrong enviroment for QA testing");
            }
            String carModel = "Tesla";
            if (carModel.equals("Tesla")){
                System.out.println(" Not Interested");
            }
            String secretPassword = "abc123";
            String inputPassword = "abc123";
            if (inputPassword!=secretPassword){
                System.out.println("Incorrect Password");
            }
        }

    }
}
