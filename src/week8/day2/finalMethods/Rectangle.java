package week8.day2.finalMethods;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public final int getPerimeter(){
        return (width + length) * 2;
    }

    public final int getArea(){
        return width * length;
    }
}
