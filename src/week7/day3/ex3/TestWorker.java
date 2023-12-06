package week7.day3.ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class TestWorker {
    public static void main(String[] args) {

        Task t1 = new Task("login", "do the login module", 5);
        Task t2 = new Task("sign up", "do the sign up module", 5);
        Task t3 = new Task("logout", "do the logout module", 3);

        ArrayList<Task> taskList = new ArrayList<>(Arrays.asList(t1, t2, t3));

        Worker w1 = new Worker();
        w1.setName("Jerry");
        w1.setTaskList(taskList);

        System.out.println(w1);

    }
}
