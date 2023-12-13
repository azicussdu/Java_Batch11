package week8.day3.ex2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    /*
    class Animal (make it abstract)
        fields: color
        methods: abstract makeSound()
                 abstract sleep()

    class Cat inherits Animal
        fields: name
        methods: implement all methods

    class Dog inherits Animal
        fields: breed
        methods: implement all methods
     */

    public static void main(String[] args) {

        Cat c1 = new Cat("white", "Boby");
        Dog d1 = new Dog("black", "Pitbull");
        Dolphin dol1 = new Dolphin("gray", 3.5);

        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(c1, d1, dol1));

        for(Animal animal : animalList){
            animal.makeSound();
            animal.sleep();
        }

    }
}
