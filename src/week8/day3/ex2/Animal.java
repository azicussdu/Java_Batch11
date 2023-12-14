package week8.day3.ex2;

/*
makeSound() - is different for all animals (miew, wuff, hrr, mooo)
sleep() -
 */

public abstract class Animal {
    private String color;

    public abstract void makeSound();

    public abstract void sleep();

    public abstract void eat(Food food);

    public Animal(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

enum Food{
    BEEF, FRUITS, FISH,
}
