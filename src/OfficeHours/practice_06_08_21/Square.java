package OfficeHours.practice_06_08_21;

public class Square extends Shape {


     double side ;


    @Override
    public void calculateArea() {
       area = side * side;
    }



    @Override
    public void calculatePerimeter() {
       perimeter = side * 4;





    }
    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
