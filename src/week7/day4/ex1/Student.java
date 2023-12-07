package week7.day4.ex1;

public class Student extends Person {

    private String universityName;
    private double gpa; // 0.0 - 4.0

    @Override
    public void sayHello(){
        System.out.println("hello from a Student class");
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
