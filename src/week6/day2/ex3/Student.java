package week6.day2.ex3;

public class Student {
    String name;
    int age;
    double gpa; // min:0 - max:4  (2.8)

    public void showStudentInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gpa: " + gpa);
    }

    public String getStudentInfo(){
        String info = "name is " + name + "\n";
        info = info + "age is " + age + "\n";
        info = info + "gpa is " + gpa + "\n";

        // String info = "name is Mary\nage is 19\ngpa is 3.4\n";
        return info;
    }

    // if you call it "toString()" - so it is a magic method
    public String toString(){ // should be String (not void) also name = toString()
        String info = "name is " + name + "\n";
        info = info + "age is " + age + "\n";
        info = info + "gpa is " + gpa + "\n";

        // String info = "name is Mary\nage is 19\ngpa is 3.4\n";
        return info;
    }
}
