package allDaysJava.hiding;

public class Parent {
    public String name = "parent = Joe Smith";

    public void introduce1(){ System.out.println("Hello I am " + name); }

}

class Child1 extends Parent{
    public String name = "child = Bob Smith";

    public void introduce2(){ System.out.println("Hello I am " + name); }
}

class Runner {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.introduce1();

        Child1 child = new Child1();
        child.introduce1();
        child.introduce2();
    }
}
