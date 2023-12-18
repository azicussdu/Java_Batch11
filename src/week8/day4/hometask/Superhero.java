package week8.day4.hometask;

public abstract class Superhero {
    private Universe universe;

    public Superhero(Universe universe){
        this.universe = universe;
    }

    public abstract void attack();
}

enum Universe {
    DC, MARVEL
}
