package week7.day4.ex2;

public class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public String toString(){
        return "name: " + name + "\nsalary: " + salary;
    }

    public double calculateSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
