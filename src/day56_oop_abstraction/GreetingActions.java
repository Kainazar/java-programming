package day56_oop_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        Mountain ml = new Mountain();
        ml.hi();
        ml.bye();

        Greeting gt = new Mountain();
        gt.bye();
        gt.hi();
    }
}
