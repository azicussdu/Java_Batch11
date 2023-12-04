package week7.day1.ex2;

public class Circle {
    public double radius;
    public static double pi = 3.14;

    public double getPerimeter(){
        return 2 * pi * radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }
}
