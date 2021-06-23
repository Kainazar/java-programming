package day56_oop_abstraction;

public class Japanese implements  Greeting {
    @Override
    public void hi() {
        System.out.println("さようなら");
    }

    @Override
    public void bye() {
        System.out.println("さようなら");
    }
}
