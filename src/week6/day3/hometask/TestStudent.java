package week6.day3.hometask;

public class TestStudent {
    public static void main(String[] args) {

        Lesson les1 = new Lesson();
        les1.name = "Math";
        les1.credits = 13;

        Lesson les2 = new Lesson();
        les2.name = "Physics";
        les2.credits = 12;

        Lesson les3 = new Lesson();
        les3.name = "Java";
        les3.credits = 10;

        Lesson les4 = new Lesson();
        les4.name = "C++";
        les4.credits = 10;

        Student stud1 = new Student();
        stud1.name = "Mike";
        stud1.lessonsList.add(les1);
        stud1.lessonsList.add(les2);
        stud1.lessonsList.add(les3);
        stud1.lessonsList.add(les4);

        stud1.showAllLessons();

        Student.showStudentRules();

        System.out.println("amount of semesters for Mike: " + stud1.getBusySemesters());

    }
}
