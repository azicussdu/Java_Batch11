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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
