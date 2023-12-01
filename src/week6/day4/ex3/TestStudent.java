package week6.day4.ex3;

public class TestStudent {
    public static void main(String[] args) {

        Student stud1 = new Student(); // new Student() - calling a constructor
        System.out.println(stud1);

        //after I create my own contructor, now I can not call Student() - default constructor
        // but I can call my own constructor
        Student stud2 = new Student("Mike", 22);
        System.out.println(stud2);

        Student stud3 = new Student("Mary");
        System.out.println(stud3);

        Student stud4 = new Student(18);
        System.out.println(stud4);
    }
}
