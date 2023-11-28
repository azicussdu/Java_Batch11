package week6.day2.ex4;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.length = 6;
        rec1.width = 4;

        System.out.println(rec1); // java will call toString() method for me

//        rec1.showPerimeter(); // prints the perimeter of this rectangle
//        rec1.showArea(); // prints the area of this rectangle
//
//        int perim = rec1.getPerimeter();
//        System.out.println("the perimeter = " + perim);
//
//        System.out.println("the area = " + rec1.getArea());

    }
}
