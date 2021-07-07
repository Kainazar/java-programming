package day56_oop_abstraction.greeties;

public  class Mountain implements Greeting {

    @Override
    public void hi() {
        System.out.println("halo halo");
    }

    @Override
    public void bye() {
        System.out.println("bylo bylo");
    }
}
