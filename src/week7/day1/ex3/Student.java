package week7.day1.ex3;

public class Student {
    String name;
    public static int count = 0;

    public Student(String name){
        this.name = name;
        count++;
    }

    public Student(){
        count++;
    }
}
