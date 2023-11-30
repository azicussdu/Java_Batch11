package week6.day4.ex1;

public class TestStudent {
    public static void main(String[] args) {

        /*
        Constructor - is a SPECIAL method that we use(call)
        to create an object of a class.
         */

        // new Student() - we are calling a constructor of a class
        Student stud1 = new Student();
        stud1.name = "Mike";
        stud1.age = 21;
        stud1.gpa = 3.5;
        System.out.println(stud1); // it will call stud1.toString()

        // creating an object already with some values
        Student stud2 = new Student("Mary", 20, 3.6);
        System.out.println(stud2);

        Student stud3 = new Student("Hamza", 29);
        System.out.println(stud3);


    }
}
