package week7.day4.ex2;

public class Tester extends Worker{
    private int amountOfProjects; // how many projects he is testing now

    public Tester(String name, double salary, int amountOfProjects){
        super(name, salary);
        setAmountOfProjects(amountOfProjects);
    }

    @Override
    public String toString(){
        return super.toString() + "\namountOfProjects: " + amountOfProjects;
    }

    @Override
    public double calculateSalary(){
        return getSalary() + (amountOfProjects * 5000);
    }

    public int getAmountOfProjects() {
        return amountOfProjects;
    }

    public void setAmountOfProjects(int amountOfProjects) {
        this.amountOfProjects = amountOfProjects;
    }
}
