package allDaysJava.day55_abstraction_exercise_example.Interfaces_examples;

public interface MyInterface {


    public abstract  void learn ();


}
interface  MyInterface2{

}
       class MyClass implements  MyInterface, MyInterface2 {


           @Override
           public void learn() {
               System.out.println("Learning Interface!");
           }
       }



       class Main {
           public static void main(String[] args) {
               MyClass myClass = new MyClass();
               myClass.learn();




           }
       }
