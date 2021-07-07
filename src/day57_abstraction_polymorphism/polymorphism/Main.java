package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     // Polymorphism way
        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal cat = new Cat();

        dog.makeNoise(); horse.makeNoise(); cat.makeNoise();

        // POLYMORPHISM list of objects. Liss data type is Parent class.
        // objects are any of child classes.
        List <Animal>  listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Cat());
        listOfAnimals.add(new Horse());

        for (Animal each : listOfAnimals) {
            each.makeNoise();
            System.out.println(listOfAnimals.size());



            }
        }



    }

