package week6.day3.ex4;

import java.util.ArrayList;

public class Worker {
    String name;
    ArrayList<Task> taskList = new ArrayList<>();

    public void showAllTasks(){
        System.out.println("the worker name is: " + name);

        for(Task task : taskList){
            System.out.println("task name: " + task.name + ", hours to complete: " + task.hoursToComplete);
        }
    }

    public double getBusyDaysAmount(){
        int hoursTotal = 0;
        for(Task task : taskList){
            hoursTotal = hoursTotal + task.hoursToComplete;
        }

        return hoursTotal / 8.0;
    }

    public static void showWorkerRules(){
        System.out.println("Be positive");
        System.out.println("Always smile");
        System.out.println("Be collaborative");
        System.out.println("Listen to your boss");
        System.out.println("Be respectful");
        System.out.println("Be disciplined");
    }
}
