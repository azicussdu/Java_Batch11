package week8.day1.ex1;

public class Circle extends Shape{
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    public void showPerimeter() {
        System.out.println("perimeter: " + (2*pi*radius));
    }

    @Override
    public void showArea() {
        System.out.println("area: " + (pi*radius*radius));
    }

    public String toString(){
        return "area = " + (pi*radius*radius) + "\nperimeter = " + (2*pi*radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
