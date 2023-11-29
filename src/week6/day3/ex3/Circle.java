package week6.day3.ex3;

/*
    radius is nonstatic - so each object will have its own value for radius (1.2, 2.2, 4.5 ...)
    pi is static - so all object will have only one value for pi (which is 3.14)
 */

public class Circle {
    double radius;
    static double pi = 3.14;

    public void showPerimeter(){
        System.out.println("perimeter = " + (2 * pi * radius));
    }

    public void showArea(){
        System.out.println("area = " + (pi * radius * radius));
    }

    public double getPerimeter(){
        return 2 * pi * radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }

    public String toString(){
        String info = "radius = " + radius + "\n";
        info = info + "area = " + getArea() + "\n";
        info = info + "perimeter = " + getPerimeter();

        return info;
    }

}
