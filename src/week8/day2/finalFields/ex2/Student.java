package week8.day2.finalFields.ex2;

/*
The second way to initialize the final field is:
    initialize it at the moment when you create an object (so inside constructor)
 */

public class Student {
    public final String university;

    public Student(String university){
        this.university = university;
    }

    // so you can not create setUniversity()
    // because it will try to change the value of university

    public String getUniversity(){
        return university;
    }

    public String toString(){
        return "university: " + university;
    }
}
