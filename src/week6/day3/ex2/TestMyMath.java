package week6.day3.ex2;

public class TestMyMath {
    public static void main(String[] args) {

        // if I want to call method getMax()
        // I have to create an object of MyMath class
//        MyMath math = new MyMath();
//        System.out.println(math.getMax(4, 5));

        /*
        After I changed method into static.
        So now I can call this method directly from a class.
        No need to create an object to call it.
         */
        System.out.println(MyMath.getMax(4, 7));

        /*
        Nonstatic - means that it belongs to an object,
        it means that you can call it only from an individual object.

        Static - means that it belongs to a class.
        So you can call them directly from a class (no need to create an object)
         */
    }
}
