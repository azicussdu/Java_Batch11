package week6.day4.ex1;

public class Student {
    String name;
    int age;
    double gpa;

    /*
    constructor - has the same name as class name
    constructors do not have return type (no void or int...)
     */

    // default constructor - the constructor with no parameters
    // default constructors we use to create an empty object
    public Student(){
        System.out.println("Object is created");
    }

    public Student(String n, int a){
        name = n;
        age = a;
    }

    public Student(String n, int a, double g){
        name = n;
        age = a;
        gpa = g;
    }

    public String toString(){
        String info = "name: " + name + "\n";
        info = info + "age: " + age + "\n";
        info = info + "gpa: " + gpa + "\n";
        return info;
    }
}
