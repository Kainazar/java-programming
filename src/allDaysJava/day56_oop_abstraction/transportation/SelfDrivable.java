package allDaysJava.day56_oop_abstraction.transportation;

public interface SelfDrivable {
    void autoPiloting();
     // void  selfPark();  this causes error in sub classes, because they must override abstract method
     public default void selfPark() {
         System.out.println("PERFORMING SELF PARKING STEPS");
     }
}


