package week7.day2.ex1;

public class Citizen {
    /*
       final field: by the time when object(of Citizen) is created -
       the final field must be initialized!
       So final field should be initialized: at the same time when object created
     */
    public final int id;
    public String name;
    public final String countryName = "USA";

    public Citizen(){
        id = 10;
    }

    public Citizen(String name){
        this.name = name;
        id = 10;
    }
}
