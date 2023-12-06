package week7.day3.ex1;

/*
OOP - Object Oriented Programming. OOP 4 principles.

1. Encapsulation - hiding the data(making the fields private), but giving access to
these fields via methods(set, get methods).
 */

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student();
//        s1.name = "fakename";
//        s1.age = -23;
//        s1.gpa = 5.4;

        s1.setAge(18);
        System.out.println("age: " + s1.getAge());

        s1.setName("mike");
        System.out.println("name: " + s1.getName());

        s1.setGpa(3.4);
        System.out.println("gpa: " + s1.getGpa());

//        System.out.println(s1);

    }
}
