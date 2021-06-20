package day54_abstraction;

public class Salat extends  MenuItem{
    @Override
    public void prepare() {
        System.out.println("My wife made nice Salats");
    }

    @Override
    public void serve() {
        System.out.println("Giving us for dinner");
    }
}
