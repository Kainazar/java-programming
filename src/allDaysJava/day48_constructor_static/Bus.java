package allDaysJava.day48_constructor_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Bus {
   Driver driver;
   Engine engine;

public String toString () {
   return driver.getName()+ " | ";
}
}
