package week8.day3.ex1;

import java.util.ArrayList;

public class TestShapes {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 6);
        Rectangle r2 = new Rectangle(6, 4);
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle(5.2);

        // I can not create object of Shape, it is abstract
//        Shape sh1 = new Shape();

        ArrayList<Shape> shapesList = new ArrayList<>();
        shapesList.add(r1);
        shapesList.add(r2);
        shapesList.add(c1);
        shapesList.add(c2);



//        Shape sh1 = new Shape();
//        System.out.println("area of a shape = " + sh1.getArea());

    }
}
