package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 25;
        boolean isPrimeMember = false;
        if (isPrimeMember ){
            System.out.println("Eligible for free 2 day shipping");
        }else {
            if (itemPrice >= 30){
                System.out.println("Eligible for free regular shipping");
            }else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }


    }
}

