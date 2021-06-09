package OfficeHours.practice_06_08_21;

public class ShapeObjects {

    public static void main(String[] args) {

        Shape  shape1 = new Shape();
        shape1.calculateArea();

        Square square = new Square();
        square.side = 5;
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println(square);
        
        Rectangle rec1 = new Rectangle();
        rec1.width =3;
        rec1.length = 4;
        rec1.calculateArea();
        rec1.calculatePerimeter();
        System.out.println("rec1 = " + rec1);


        Circle c1 = new Circle();
        c1.radius = 10;
        c1.calculateArea();
        c1.calculatePerimeter();
        System.out.println("c1 = " + c1);

    }
}
