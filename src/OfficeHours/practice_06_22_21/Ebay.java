package OfficeHours.practice_06_22_21;

public class Ebay extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to ebay");
    }


    }

