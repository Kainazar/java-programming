package OfficeHours.Practice_05_17_21;

public class RectangleObject {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        rectangle.setDimensions(12, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getArea());
    }
}


