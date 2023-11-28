package week6.day2.ex3;

public class TestStudent {
    public static void main(String[] args) {

        Student stud1 = new Student();
        stud1.name = "Mary";
        stud1.age = 19;
        stud1.gpa = 3.4;

        Student stud2 = new Student();
        stud2.name = "Mike";
        stud2.age = 20;
        stud2.gpa = 3.2;

        // first way
//        System.out.println("name: " + stud1.name);
//        System.out.println("age: " + stud1.age);
//        System.out.println("gpa: " + stud1.gpa);

        // second way
//        stud1.showStudentInfo();
//        stud2.showStudentInfo();

        // third way
//        String stud1Info = stud1.getStudentInfo();
//        System.out.println(stud1Info);
//
//        System.out.println(stud2.getStudentInfo());

        // forth way
        System.out.println(stud1.toString());

        // even if you don't call toString() method
        // java will automatically find it and call
        System.out.println(stud1);

    }
}
