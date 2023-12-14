package week8.day3.ex2;

public class Monkey extends Animal{

    public Monkey(String color) {
        super(color);
    }

    @Override
    public void makeSound() {
        System.out.println("Wakaka Wakaka");
    }

    @Override
    public void sleep() {
        System.out.println("Ok, I am sleeping");
    }

    @Override
    public void eat(Food food) {
        if(food == Food.FRUITS)
            System.out.println("Ok, I am eating");
        else
            System.out.println("No, I do not eat " + food);
    }
}
