package week8.day2.ex1;

public class Dog extends Animal {
    private String breed;

    public Dog(String color, String breed){
        super(color);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Wuff wuff");
    }

    public void givePaw(){
        System.out.println("Ok, take my paw");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
