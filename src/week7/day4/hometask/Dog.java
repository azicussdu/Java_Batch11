package week7.day4.hometask;

/*
class Dog has 3 fields:
    fields inherited from Animal class: color, isWild
    own fields: breed
 */
public class Dog extends Animal{

    private String breed;

    /*
    There is a rule: Each constructor from a child class MUST
    call(use) one constructor from a parent class.
     */
    public Dog(String color, boolean isWild, String breed){
        super(color, isWild);
        setBreed(breed);
    }

    public String toString(){
        return super.toString() + "\nbreed: " + breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Wuff Wuff");
    }

    public Dog(){
        System.out.println("Default constructor from Dog");
        // java will by default call super(); - so it calls default constructor from Animal
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
