package week6.day3.ex1;

public class TestCat {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Oskar";

        Cat cat2 = new Cat();
        cat2.name = "Cotton";

        Cat cat3 = new Cat();
        cat3.name = "Lucky";

        cat1.sayMeaw(); // we can call it only from object (because it is not static)
        cat2.sayMeaw();
        cat3.sayMeaw();

        /*
        If the field "name" is nonstatic - so each individual cat will
        have its own name

        If the field "name" is static - so all objects will share the same
        name. Because static fields belong to a class (not to individual object)
         */


    }
}
