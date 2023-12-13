package week8.day2.hometask;

public class Tester extends Worker{
    private Level level;

    public Tester(String name, double salary, Level level) {
        super(name, salary);
        setLevel(level);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0;
        switch (level){
            case JUNIOR: totalSalary = getSalary() + getSalary() * 0.1; break;
            case MIDDLE: totalSalary = getSalary() + getSalary() * 0.3; break;
            case SENIOR: totalSalary =  getSalary() + getSalary() * 0.5; break;
            default: totalSalary = getSalary();
        }
        return totalSalary;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String toString(){
        return super.toString() + ", level: " + level;
    }
}

enum Level {
    JUNIOR, MIDDLE, SENIOR
}
