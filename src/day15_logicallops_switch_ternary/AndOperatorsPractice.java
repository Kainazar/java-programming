package day15_logicallops_switch_ternary;

public class AndOperatorsPractice {
    public static void main(String[] args) {
        boolean onSale=true;
        boolean freeShipping=true;
        String itemName = "Wooden Spoon";
     // (onSale == true && freeShipping == true) you can do this way too
        if (onSale && freeShipping){
            System.out.println("Add to bag");
        }else {
            System.out.println("Continue Shopping");
        }if (freeShipping && onSale && itemName.equals(" Wooden Spoon ")){
            System.out.println("Add to car - "+ itemName);
        }else {
            System.out.println("Continue to shopping ");
        }


    }
}
