package week7.day2.ex3;

public class Account {
    String name;
    Role role;
    Status status;

    public Account(String name, Role role, Status status){
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public String toString(){
        return "name: " + name + "\nrole: " + role + "\nstatus: " + status;
    }
}
