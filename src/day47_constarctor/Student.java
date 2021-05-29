package day47_constarctor;

public class Student {
public Student() {
    System.out.println("No args Constructors");
}
      public Student (String name) {
          System.out.println("name param constructor | " +name);
}
public Student (int age) {
    System.out.println("his is "+age+" year old");
}
public Student (String address, String car) {
    System.out.println("His address is "+ address+ "He has a nice "+ car);
}
}
