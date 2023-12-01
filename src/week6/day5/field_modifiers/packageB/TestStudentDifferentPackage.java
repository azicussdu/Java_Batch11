package week6.day5.field_modifiers.packageB;

import week6.day5.field_modifiers.packageA.Student;

public class TestStudentDifferentPackage {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.name = "Mike";
//        stud1.age = 20; // age I can't access, because it is default (package-private)
//        stud1.university = "Harvard"; // it is protected (quite same as default)
//        stud1.gpa = 3.4;

        stud1.methodPublic();
//        stud1.methodDefault(); // can not call from other package
//        stud1.methodProtected(); // can not call from other package
//        stud1.methodPrivate(); // I can not call it from outside the Student class

    }
}
