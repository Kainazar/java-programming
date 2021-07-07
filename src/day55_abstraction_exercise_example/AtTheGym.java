package day55_abstraction_exercise_example;

import day54_abstraction.FreeWeight;

public class AtTheGym {

    public static void main(String[] args) {
        Exercise exercise = new Running(); //polymorphism benefit of abstraction. later
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins - calories = " + exercise.getCaloriesCount(30) );
        System.out.println("===========================================");

        running.start();
        running.perform();
        System.out.println("Running 30 mins - calories = " + running.getCaloriesCount(30) );
        System.out.println("===========================================");

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories = " + swimming.getCaloriesCount(30) );
        System.out.println("===========================================");

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight 30 mins - calories = " + freeWeight.getCaloriesCount(30) );

    }
}


