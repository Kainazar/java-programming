package OfficeHours.practice_06_08_21;

public class Shape {
      double area;
      double perimeter;


      public void calculateArea() {
          System.out.println("Shape area");
      }

      public void calculatePerimeter () {
          System.out.println("Shape perimeter ");

      }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
