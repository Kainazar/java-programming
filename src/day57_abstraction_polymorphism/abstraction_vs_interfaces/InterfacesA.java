package day57_abstraction_polymorphism.abstraction_vs_interfaces;

public interface InterfacesA extends InterfacesB, Cloneable {

    // Interfaces can  ONLY have PUBLIC STATIC FINAL VARIABLES;
    public static final String TYPE ="interface";
    double  MAX_COUNT = 500;

//    public InterfacesA() {
//        System.out.println("Interfaces can't have a constructor");
//    }


    public abstract void absMethodD(int num);

    /**
     *
     * starting from java 8 (jdk 1,8)
     * interface can have static and default methods
     */
    public static void staticMethodE(String str){
        System.out.println("StaticMethod E is called with  "+ str);
    }

    public default void defaultMethodF() {
        System.out.println("DefaultMethod F is called");
    }

}
