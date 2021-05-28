package day47_constarctor;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 = new Student(); // No args Constructors
        Student st2 = new Student(); // No args Constructors
        Student st3=  new Student("Burak"); // name param constructor | Burak
        Student st4 = new Student("Constantin"); // name param constructor | Constantin
        Student st5 = new Student(35); // his is 35 year old
        Student st6 = new Student("777 ocean ave ", "toyota"); // His address is 777 ocean ave He has a nice toyota
    }
}
