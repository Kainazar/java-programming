package day56_oop_abstraction.plane;

import day56_oop_abstraction.greeties.Greeting;
import day56_oop_abstraction.transportation.SelfDrivable;
import day56_oop_abstraction.transportation.Transportation;

public class Plane extends Transportation implements Greeting, SelfDrivable {
    @Override
    public void hi() {
        System.out.println("Hello welcome to the fly 29934 ");
    }

    @Override
    public void bye() {
        System.out.println("Thank you for flying with us");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs " + (mile * 25.0) + " to fly " + mile + " miles");

    }

    public void land() {

    }
}