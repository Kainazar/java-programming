package allDaysJava.day55_abstraction_exercise_example.day55_abstraction;

public abstract class Exercise {

    public void start(int minutes){
        System.out.println("Warming up and starting the exercise ");
    }
    public abstract void perform() ;


    public abstract  int calories(int minutes);

    }
