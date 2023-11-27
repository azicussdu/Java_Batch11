package week6.day1.ex1;

// I created this class just to work with Person class
public class TestPerson {
    public static void main(String[] args) {
        // this is how we create an object of class Person
        Person obj1 = new Person();
        obj1.name = "John";
        obj1.surname = "Terry";
        obj1.female = false;
        obj1.age = 40;

        System.out.println("The name of obj1 is: " + obj1.name);
        System.out.println("The age of obj1 is: " + obj1.age);

        Person obj2 = new Person();
        obj2.name = "Jennifer";
        obj2.surname = "Lopez";
        obj2.female = true;
        obj2.age = 50;

        System.out.println("The surname of obj2 is: " + obj2.surname);
        System.out.println("The age of obj2 is: " + obj2.age);
    }
}
