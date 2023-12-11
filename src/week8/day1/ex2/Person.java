package week8.day1.ex2;

/*
4 access modifiers
default(package-private), public, private and
protected quite the same as default + smth
 */
public class Person {
    protected String name;
    /*
    protected:
        1. you can access from the same package
        2. you can access from anywhere if the class is my child class
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
