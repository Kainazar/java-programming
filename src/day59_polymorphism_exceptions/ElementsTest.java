package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class ElementsTest {
    public static void main(String[] args) {

        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        //loginLink.getLinkHref(); ERROR

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);
        //WebElementUtil.clickElement(new String("hello")); String is not child of WebElement

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();


        Shape shape = new Circle();
        System.out.println(shape instanceof  Circle);
        System.out.println(shape instanceof Square);

        if (shape instanceof  Circle) {
            System.out.println("it is a circle");
        }else if (shape instanceof Square){
            System.out.println("it is a Square");
        }

        System.out.println(shape.getClass().getSimpleName());
        System.out.println(shape.getClass().getName());

        if (shape.getClass().getSimpleName().equals("Square")) {
            System.out.println("It is a Square object");
        } else if (shape.getClass().getSimpleName().equals("Circle")){
            System.out.println("It i a Circle");
        }

    }




}
