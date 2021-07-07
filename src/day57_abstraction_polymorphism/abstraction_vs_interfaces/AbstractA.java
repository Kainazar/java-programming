package day57_abstraction_polymorphism.abstraction_vs_interfaces;

public abstract class AbstractA {
    int num1;
    private double sum;
    public static int count;
    public final String TYPE = "Abstract";
    public static final String LANGUAGE = "JAVA";

    public AbstractA() {
        System.out.println("Abstraction constructor");
    }

    public abstract void absMethodA();

     public void methodB(){
         System.out.println("Method B called");
     }
     public static void staticMethodC() {
         System.out.println("Static method C called");
     }


     }

