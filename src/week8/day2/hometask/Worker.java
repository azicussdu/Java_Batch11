package week8.day2.hometask;

public class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        setName(name);
        setSalary(salary);
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
        if(salary >= 0)
            this.salary = salary;
    }

    public String toString(){
        return "name: " + name + ", salary: " + salary;
    }
}
