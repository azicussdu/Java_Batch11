package week8.day2.finalMethods;

public class Square extends Rectangle{

    public Square(int sideLength){
        super(sideLength, sideLength);
    }

    // can not override these methods
    // because they are final
//    @Override
//    public int getArea(){
//        return length * width;
//    }

}
