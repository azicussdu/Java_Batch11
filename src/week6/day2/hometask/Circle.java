package week6.day2.hometask;

public class Circle {
    double radius;

    public void showPerimeter(){
        System.out.println("perimeter = " + (2 * 3.14 * radius));
    }

    public void showArea(){
        System.out.println("area = " + (3.14 * radius * radius));
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public String toString(){
        String info = "radius = " + radius + "\n";
        info = info + "area = " + getArea() + "\n";
        info = info + "perimeter = " + getPerimeter();

        return info;
    }

}
