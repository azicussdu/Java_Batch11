package week6.day2.ex2;

public class TestAnimal {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.name = "Bobby";
        a1.color = "brown";

        a1.zoo = new Zoo();
        a1.zoo.name = "Prison Zoo";
        a1.zoo.amountOfAnimals = 120;

    }
}
