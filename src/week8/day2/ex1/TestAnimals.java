package week8.day2.ex1;

import java.util.ArrayList;

/*
Polymorphism (3rd OOP principle). - means having many forms. This is ability
of an object to have many forms.

Ex: Man, can be also a father, or can be a husband, or can be a worker.
Ex: Woman, can be a mother, or can be a wife, can be a worker, boss, model...

 */
public class TestAnimals {
    public static void main(String[] args) {

//        Cat c1 = new Cat("white", true);
//        Animal c2 = new Cat("yellow", true);
//        Dog d1 = new Dog("brown", "Chihuhua");
//        Animal d2 = new Dog("grey", "Pitbull");

        // farm zoo
        ArrayList<Animal> animalsList = new ArrayList<>();

        Cat c1 = new Cat("white", true);
        Cat c2 = new Cat("black", false);
        Dog d1 = new Dog("brown", "Chihuhua");
        Cow cow1 = new Cow("white", true);

        showAllInfo(c1);
        showAllInfo(d1);

//        animalsList.add(c1);
//        animalsList.add(c2);
//        animalsList.add(d1);
//        animalsList.add(cow1);
//
//        for(Animal animal : animalsList){
//            animal.makeSound();
//
//            if(animal instanceof Dog){
//                ((Dog)animal).givePaw();
//            }
//            else if(animal instanceof Cat){
//                ((Cat)animal).haveARest();
//            }
//
//            /*
//            if this current animal is a dog so please call givePaw()
//            if this current animal is a cat so please call haveARest()
//             */
//        }
    }

    public static void showAllInfo(Animal animal){
        System.out.println("color: " + animal.getColor());
        if(animal instanceof Dog){
            System.out.println("breed: " + ((Dog)animal).getBreed());
        }
        if(animal instanceof Cat){
            System.out.println("isLazy: " + ((Cat)animal).isLazy());
        }
    }

//    public static void showAllInfo(Cat cat){
//        System.out.println("color: " + cat.getColor());
//        System.out.println("isLazy: " + cat.isLazy());
//    }

//    public static void showAllInfo(Dog dog){
//        System.out.println("color: " + dog.getColor());
//        System.out.println("breed: " + dog.getBreed());
//    }
}
