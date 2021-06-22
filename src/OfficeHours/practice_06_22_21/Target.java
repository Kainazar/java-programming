package OfficeHours.practice_06_22_21;

public class Target extends Shopping {

    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to target");
    }
}
