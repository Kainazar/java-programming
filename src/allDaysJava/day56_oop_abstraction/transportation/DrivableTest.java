package allDaysJava.day56_oop_abstraction.transportation;

import allDaysJava.day56_oop_abstraction.plane.Plane;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(10);
        model3.stop();
        model3.bye();


        Plane airplane = new Plane();
        airplane.hi();
        airplane.autoPiloting();
        airplane.cost(250);
        airplane.land();


         // Polymorphism way
         SelfDrivable sd = new Plane();
         SelfDrivable sd1 = new Tesla();
         sd.autoPiloting();
         sd1.autoPiloting();


    }
}
