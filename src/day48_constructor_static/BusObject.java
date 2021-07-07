package day48_constructor_static;

public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        //bus.engine = new Engine();
    }
}
