package allDaysJava.day44_custom_classes;

public class Person1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Bakyt";
        person1.age = 35;
        person1.firstName();
        person1.running();
        person1.burnCalory();
        person1.burnCaloryWithMile(7);
    }
}
