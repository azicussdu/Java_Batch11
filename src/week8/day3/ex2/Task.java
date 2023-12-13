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
            // animal.eat(Food.FISH);
            // animal.eat(Food.FRUITS);
            // animal.eat(Food.GRASS);

            /*
            example of a Dolphin:
                animal.eat(Food.FISH) -> ok, I eat FISH, thank you
                animal.eat(Food.FRUITS) -> are you ok? I don't eat it
                animal.eat(Food.GRASS) -> are you ok? I don't eat it

           You can also create a Cow that eats a GRASS
           You can also create a Monkey that eats fruits, and also eats grass
             */
        }

    }
}
