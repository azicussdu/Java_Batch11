package week8.day3.ex2;

public class Dolphin extends Animal{
    private double size;

    public Dolphin(String color, double size) {
        super(color);
        this.size = size;
    }

    @Override
    public void makeSound() {
        System.out.println("Kikiki");
    }

    @Override
    public void sleep() {
        System.out.println("no no, I don't sleep");
    }

    @Override
    public void eat(Food food) {
        if(food == Food.FRUITS)
            System.out.println("Ok, I am eating");
        else
            System.out.println("No, I do not eat " + food);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
