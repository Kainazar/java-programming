package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea item is selected");
            }else{
                System.out.println("coke item is selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")) {
                System.out.println("chips option is selected");
            }else{
                System.out.println("candy option is selected");
            }
        }

        int score =0;
        if ( score==0.1){
            score+= 50;
            if (score !=0) {
                score+= 50;
                System.out.println("score = " + score);
            }
        }
        
    }
}

