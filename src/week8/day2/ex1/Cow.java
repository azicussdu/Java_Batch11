package week8.day2.ex1;

public class Cow extends Animal{
    private boolean hasSpots;

    public Cow(String color, boolean hasSpots){
        super(color);
        this.hasSpots = hasSpots;
    }

    @Override
    public void makeSound() {
        System.out.println("Moooo Moooo");
    }

    public boolean isHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(boolean hasSpots) {
        this.hasSpots = hasSpots;
    }
}
