package week7.day4.hometask;

public class Animal {
    private String color;
    private boolean isWild;

    public Animal(String color, boolean isWild){
        this.color = color;
        this.isWild = isWild;
    }

    public Animal(){
        System.out.println("Default constructor from Animal");
    }

    public String toString(){
        return "color: " + color + "\nisWild: " + isWild;
    }

    public void makeSound(){
        System.out.println("some sound from animal");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean isWild) {
        this.isWild = isWild;
    }
}
