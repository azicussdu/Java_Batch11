package week9.day1.hometask;

public abstract class Superhero {
    private String name;
    private Universe universe;

    public Superhero(Universe universe, String name){
        this.name = name;
        this.universe = universe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Universe getUniverse() {
        return universe;
    }

    public void setUniverse(Universe universe) {
        this.universe = universe;
    }

    public abstract void attack();
}

enum Universe {
    DC, MARVEL
}
