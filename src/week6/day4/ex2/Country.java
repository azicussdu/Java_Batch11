package week6.day4.ex2;

public class Country {
    String name;
    String continent;
    int population;

    public Country(String name, String continent, int population){
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    public Country(String name, String continent){
        this(name, continent, 0);
    }

    public Country(String name){
        this(name, "");
    }

    public String toString(){
        return "name: " + name +
                "\ncontinent: " + continent +
                "\npopulation: " + population;
    }
}
