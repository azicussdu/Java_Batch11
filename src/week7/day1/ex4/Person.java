package week7.day1.ex4;

public class Person {
    String name;
    boolean male;

    static int countMale = 0;
    static int countFemale = 0;

    public Person(String name, boolean male){
        this.name = name;
        this.male = male;
        countObjects();
    }

    public Person(boolean male){
        this.male = male;
        countObjects();
    }

    private void countObjects(){
        if(this.male == true)
            countMale++;
        else
            countFemale++;
    }
}
