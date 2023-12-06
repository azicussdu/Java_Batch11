package week7.day3.ex3;

public class Task {
    private String name;
    private String description;
    private int hoursToComplete;

    public Task(String name, String description, int hoursToComplete) {
        setName(name);
        setDescription(description);
        setHoursToComplete(hoursToComplete);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHoursToComplete() {
        return hoursToComplete;
    }

    public void setHoursToComplete(int hoursToComplete) {
        if(hoursToComplete > 0)
            this.hoursToComplete = hoursToComplete;
        else
            System.out.println("hours to complete must be positive value");
    }

    public String toString() {
        return "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", hoursToComplete=" + hoursToComplete;
    }
}
