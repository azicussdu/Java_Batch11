package week8.day3.ex1;

/*
If your class is abstract - then you can not create object of this class.

All you child classes MUST implement all your abstract methods,
if they don't want to implement so they must be declared abstract.

If in your class you have at least 1 abstract method - then a class also
should be declared as abstract!
 */

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
