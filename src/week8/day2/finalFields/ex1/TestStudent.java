package week8.day2.finalFields.ex1;

public class TestStudent {
    public static void main(String[] args) {

        /*
        all student will have university = "Harvard"
        so you can not change it to another university (because it is final)
         */

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.university);
        System.out.println(s2.university);

        // can not change it
//        s1.university = "MIT";

    }
}
