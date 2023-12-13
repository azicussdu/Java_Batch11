package week8.day2.hometask;

public class HRWorker extends Worker{
    private int yearsOfExperience;

    public HRWorker(String name, double salary, int yearsOfExperience){
        super(name, salary);
        setYearsOfExperience(yearsOfExperience);
    }

    @Override
    public double calculateSalary() {
        return getSalary() + getSalary() * (yearsOfExperience * 0.1);
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if(yearsOfExperience >= 0)
            this.yearsOfExperience = yearsOfExperience;
    }

    public String toString(){
        return super.toString() + ", years of Exp: " + yearsOfExperience;
    }
}
