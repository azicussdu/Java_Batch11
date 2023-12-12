package week8.day2.ex1;

public class Animal {
    private String color;

    public Animal(String color){
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Animal is making a sound");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
