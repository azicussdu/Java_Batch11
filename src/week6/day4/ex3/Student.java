package week6.day4.ex3;

public class Student {
    String name;
    int age;

    /*
    if in a class you don't create any constructors, java will create
    a default constructor for you. But it will be invisible
     */

    /*
    But if you create your own constructor,
    then java removes that invisible default constructor
     */
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(int age){
        this(null, age);
    }

    public Student(){
    }

    public Student(String name){
        this(name, 1);
    }


    public String toString(){
        return "name: " + name + "\nage: " + age;
    }
}
