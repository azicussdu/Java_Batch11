package week7.day3.ex3;

import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList<Task> taskList = new ArrayList<>();

    public ArrayList<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Task> taskList) {
        this.taskList = taskList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", taskList=" + taskList;
    }
}
