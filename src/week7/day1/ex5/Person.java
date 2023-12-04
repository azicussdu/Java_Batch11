package week7.day1.ex5;

public class Person {

    /*
    final with the fields.
    If you use final keyword with the class fields:
    - final field should be initialized when the object is created (not later)
     */
    final int id; // identification number

    public Person(){
        id = (int)(Math.random() * 1000000) + 1; // 1-1000000
    }
}
