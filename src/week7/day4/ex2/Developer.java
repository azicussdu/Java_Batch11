package week7.day4.ex2;

public class Developer extends Worker{
    private Level level;

    public Developer(String name, double salary, Level level){
        super(name, salary);
        setLevel(level);
    }

    @Override
    public String toString(){
        return super.toString() + "\nlevel: " + level;
    }

    @Override
    public double calculateSalary(){
        double totalSalary = 0;

        switch (level){
            case JUNIOR: totalSalary = getSalary() * 1.1; break;
            case MIDDLE: totalSalary = getSalary() * 1.3; break;
            case SENIOR: totalSalary = getSalary() * 1.5; break;
        }

        return totalSalary;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
