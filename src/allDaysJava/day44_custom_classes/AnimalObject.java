package allDaysJava.day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.walk();
        animal.see();
        animal.price();
        animal.see();
        // adding another object "cheetah Object
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";// change value / reassign to cheetah
        cheetahObj.jump();
        cheetahObj.eat("help");


    }

}



