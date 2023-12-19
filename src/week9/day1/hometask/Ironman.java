package week9.day1.hometask;

public class Ironman extends Superhero implements IFlyable, IShootable {

    public Ironman(Universe universe) {
        super(universe, "Ironman");
    }

    @Override
    public void attackFromSky() {
        System.out.println("Flying with a suit and attacking...");
    }

    @Override
    public void shoot() {
        System.out.println("Shooting from a suit...");
    }

    @Override
    public void attack() {
        attackFromSky();
        shoot();
    }
}
