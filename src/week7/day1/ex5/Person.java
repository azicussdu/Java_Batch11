package week7.day1.ex5;

public class Person {

    /*
    final with the fields.
    If you use final keyword with the class fields:
    - final field should be initialized when the object is created (not later)
     */
    private final int id; // identification number
    private static int number = 1;
    String name;

    public Person(){
        id = number;
        number++;
    }

    public Person(String name){
        this.name = name;
        id = number;
        number++;
    }

    public String toString(){
        return "id: " + id + ", name: " + name;
    }
}
