package week6.day3.hometask;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Lesson> lessonsList = new ArrayList<>();

    public void showAllLessons(){
        for(Lesson les : lessonsList){
            System.out.println("name: " + les.name + " | " + " amount of credits: " + les.credits);
        }
    }

    public double getBusySemesters(){
        double totalCredits = 0;

        for(Lesson les : lessonsList){
            totalCredits = totalCredits + les.credits;
        }

        return totalCredits / 30.0;
    }

    public static void showStudentRules(){
        System.out.println("Be polite");
        System.out.println("Be positive");
        System.out.println("Listen to the teacher");
    }
}
