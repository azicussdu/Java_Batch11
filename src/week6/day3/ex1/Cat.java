package week6.day3.ex1;

public class Cat {
    String name;
    int age;

    // sayMeaw() - method is nonstatic method (no "static" keyword)
    // nonstatic - means that it belongs to an object (not class)
    public void sayMeaw(){
        System.out.println("cat: " + name + " says meeaawww");
    }
}
