package week8.day2.hometask;

public class Manager extends Worker{
    private int teamMembers;

    public Manager(String name, double salary, int teamMembers) {
        super(name, salary);
        setTeamMembers(teamMembers);
    }

    @Override
    public double calculateSalary() {
        if(teamMembers <= 5)
            return getSalary() + getSalary() * 0.1;
        else
            if(teamMembers <= 10)
                return getSalary() + getSalary() * 0.3;
            else
                return getSalary() + getSalary() * 0.5;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers) {
        if(teamMembers >= 0)
            this.teamMembers = teamMembers;
    }

    public String toString(){
        return super.toString() + ", amount of team members: " + teamMembers;
    }
}
