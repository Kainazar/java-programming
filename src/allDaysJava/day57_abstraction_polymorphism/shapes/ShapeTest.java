package allDaysJava.day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(circle);

        for (Shape each : shapes) {
            each.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());
    }

    /**
     * Static method: draw shape
     * accepts object of shape
     * then calls draw() method
     */

  public static void drawShape(Shape shape) {
      System.out.println("-----> drawing shape");
     shape.draw();
  }
//    public static void drawShape(Square shape) {
//        System.out.println("-----> drawing shape");
//        shape.draw();
    }




