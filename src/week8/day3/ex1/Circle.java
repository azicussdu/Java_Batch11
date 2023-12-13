package week8.day3.ex1;

/*
If Circle class inherits from a Shape class then you have 2 options:
    1) You must implement all abstract methods from Shape class
    2) You will declare Circle as an abstract class
 */
public class Circle extends Shape{
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
