package day48_constructor_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        //bus.engine = new Engine();
    }
}
