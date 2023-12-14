package week8.day3.ex2;

public class Cat extends Animal{
    private String name;

    public Cat(String color, String name) {
        super(color);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("I am already sleeping");
    }

    @Override
    public void eat(Food food) {
        if(food == Food.BEEF || food == Food.FISH)
            System.out.println("Ok, I am eating");
        else
            System.out.println("I do not eat " + food);
    }

    @Override
    public void makeSound() {
        System.out.println("Miew miew");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
