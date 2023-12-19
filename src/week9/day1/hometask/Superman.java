package week9.day1.hometask;

public class Superman extends Superhero implements IFlyable, IShootable {

    public Superman(Universe universe){
        super(universe, "Superman");
    }

    @Override
    public void attack() {
        attackFromSky();
        shoot();
    }

    @Override
    public void attackFromSky() {
        System.out.println("Superman is attacking from sky...");
    }

    @Override
    public void shoot() {
        System.out.println("Superman is shooting using his eye laser...");
    }
}
