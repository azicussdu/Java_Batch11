package week6.day5.field_modifiers.packageA;

public class TestStudentSamePackage {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.name = "Mike";
        stud1.age = 20;
        stud1.university = "Harvard";
//        stud1.gpa = 3.4; // I can not use gpa outside the Student class

        stud1.methodPublic();
        stud1.methodDefault();
        stud1.methodProtected();
//        stud1.methodPrivate(); // I can not call it from outside the Student class

    }
}
