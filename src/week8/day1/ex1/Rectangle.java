package week8.day1.ex1;

public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int width, int length){
        setWidth(width);
        setLength(length);
    }

    @Override
    public void showPerimeter() {
        System.out.println("perimeter: " + (width + length) * 2);
    }

    @Override
    public void showArea() {
        System.out.println("area: " + (width * length));
    }

    public String toString(){
        return "perimeter = " + ((width + length) * 2) + "\narea = " + (width * length);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
