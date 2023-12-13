package week8.day3.ex2;

public class Dog extends Animal{
    private String breed;

    public Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }

    @Override
    public void sleep() {
        System.out.println("ok, I will sleep");
    }

    @Override
    public void makeSound() {
        System.out.println("Wuff wuff");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
