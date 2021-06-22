package OfficeHours.practice_06_22_21;

public  abstract class Shopping {
    /**
     * Create an abstract class Shopping
     * - Declare two abstract methods:
     * buyItem(), returnItem()
     * <p>
     * Create a concrete class Target
     * - Inherit Shopping and implement all abstract methods
     * <p>
     * Create an interface Shipping
     * - Declare an abstract methods:
     * payForShipping(boolean)
     * <p>
     * Create an abstract class OnlineShopping
     * - Inherits Shopping and implements Shipping
     * - Does not need to implement any abstract methods
     * <p>
     * Create a concrete class Amazon
     * - Inherit OnlineShopping and implement all abstract methods
     * <p>
     * Create a concrete class Ebay
     * - Inherit OnlineShopping and implement all abstract methods
     * <p>
     * Create an interface AllowUsersToSell
     * - Declare an abstract method:
     * uploadProduect()
     */

    public abstract void buyItem();
    public abstract void returnItem();

}
