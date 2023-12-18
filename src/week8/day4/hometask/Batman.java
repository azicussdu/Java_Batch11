package week8.day4.hometask;

public class Batman extends Superhero implements IFlyable{

    public Batman(Universe universe) {
        super(universe);
    }

    @Override
    public void attackFromSky() {
        System.out.println("Batman is flying as a bat and attacking...");
    }

    @Override
    public void attack() {
        attackFromSky();
    }
}
