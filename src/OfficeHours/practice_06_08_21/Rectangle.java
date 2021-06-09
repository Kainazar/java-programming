package OfficeHours.practice_06_08_21;

public class Rectangle extends  Shape {

    double length;
    double width;


    @Override
    public void calculateArea() {
        super.calculateArea();
    }

    @Override
    public void calculatePerimeter() {
        super.calculatePerimeter();
        perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString();


    }
}
