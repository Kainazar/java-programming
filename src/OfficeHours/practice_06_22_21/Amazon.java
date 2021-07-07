package OfficeHours.practice_06_22_21;

public class Amazon extends OnlineShopping implements AllowUserToSell{

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Card");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item form amazon");
    }


    @Override
    public void uploadProduct() {

    }
}

