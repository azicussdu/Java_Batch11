package week9.day1.hometask;

public class Groot extends Superhero {

    public Groot(Universe universe) {
        super(universe, "Groot");
    }

    @Override
    public void attack() {
        System.out.println("I am Groot, and just boxing...");
    }
}
