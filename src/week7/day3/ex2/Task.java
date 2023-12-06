package week7.day3.ex2;

public class Task {
    /*
    create a class Date with fields: int day(1-31), int month(1-12), int year(only positive).
    All fields must be private. And provide getter and setter methods for each field.

    Test it.
     */

    public static void main(String[] args) {

//        Date d1 = new Date();
//        d1.setDay(40);
//        d1.setMonth(10);
//        d1.setYear(-200);
//        System.out.println(d1);

        Date d2 = new Date(40, 10, -200);
        System.out.println(d2);

    }
}
