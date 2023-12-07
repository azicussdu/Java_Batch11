package week7.day4.ex1;

/*
    OOP - Object Oriented Programming. OOP 4 principles.

    1. Encapsulation - hiding the data(making the fields private), but giving access to
    these fields via methods(set, get methods).

    2. Inheritance - is a mechanism where one class is allowed to inherit
    fields and methods from another class.
    So we can say that we are creating a new class based on an existing class.

     Person - is parent class / super class.
     Student and Worker - are child classes / sub classes.

     Overriding - is a feature that allows a child class to provide
     a specific implementation of a method that is already provided by a parent class.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isFemale;

    public void sayHello(){
        System.out.println("Hello from a Person class");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }
}
