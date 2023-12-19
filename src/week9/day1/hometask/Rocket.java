package week9.day1.hometask;

public class Rocket extends Superhero implements IShootable {

    public Rocket(Universe universe) {
        super(universe, "Rocket");
    }

    @Override
    public void shoot() {
        System.out.println("Rocket is shooting with a gun...");
    }

    @Override
    public void attack() {
        shoot(); // only can shoot
    }
}
