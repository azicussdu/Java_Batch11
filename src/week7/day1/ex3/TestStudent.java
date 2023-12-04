package week7.day1.ex3;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("John");
        Student s2 = new Student();
        Student s3 = new Student("David");
        Student s5 = new Student();

        System.out.println(Student.count); // 4

    }
}
