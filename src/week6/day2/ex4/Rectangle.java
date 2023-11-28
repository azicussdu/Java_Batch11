package week6.day2.ex4;

public class Rectangle {
    int width;
    int length;

    public void showPerimeter(){
        System.out.println("perimeter = " + (width+length)*2);
    }

    public void showArea(){
        System.out.println("area = " + (width * length));
    }

    public int getPerimeter(){
        return (width+length)*2;
    }

    public int getArea(){
        return width * length;
    }

    public String toString(){
        String info = "width = " + width + "\nlength = " + length + "\n";
        info = info + "perimeter = " + getPerimeter() + "\n";
        info = info + "area = " + getArea() + "\n";
        return info;
    }
}
