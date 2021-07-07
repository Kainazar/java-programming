package day57_abstraction_polymorphism.abstraction_vs_interfaces;

public class ConcreteA extends  AbstractA implements  InterfacesA , InterfacesB{

    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation called");

    }

    @Override
    public void methodB() {
        System.out.println("methodB override is called");
    }

//    @Override --> static method are hidden we can't Override
   public static void staticMethodC()  {
       System.out.println("Static Method C hidden version is called");
   }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version called");
    }
}
