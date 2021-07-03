package allDaysJava.day56_oop_abstraction.greeties;

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
