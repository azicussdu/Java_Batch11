package week8.day1.ex1;

public class Square extends Rectangle{

    public Square(int sideLength){
        // we are using constructor from Rectangle class
        // and setting same number as a length and width of it
        super(sideLength, sideLength);
    }
}
