package week6.day3.ex4;

public class TestWorker {
    public static void main(String[] args) {

        Task task1 = new Task();
        task1.name = "registration module";
        task1.hoursToComplete = 8;

        Task task2 = new Task();
        task2.name = "create a database";
        task2.hoursToComplete = 2;

        Task task3 = new Task();
        task3.name = "login module";
        task3.hoursToComplete = 6;

        Task task4 = new Task();
        task4.name = "test registration module";
        task4.hoursToComplete = 6;

        Task task5 = new Task();
        task5.name = "test login module";
        task5.hoursToComplete = 6;

        Worker worker1 = new Worker();
        worker1.name = "John";
        worker1.taskList.add(task1);
        worker1.taskList.add(task2);
        worker1.taskList.add(task3);

        Worker worker2 = new Worker();
        worker2.name = "Mary";
        worker2.taskList.add(task4);
        worker2.taskList.add(task5);

//        worker1.showAllTasks();
//        System.out.println("---------------");
//        worker2.showAllTasks();

//        Worker.showWorkerRules();

        worker2.showAllTasks();
        System.out.println("he is busy for " + worker2.getBusyDaysAmount() + " days");

//        worker1.showAllTasks();
//        System.out.println("he is busy for " + worker1.getBusyDaysAmount() + " days"); // he is busy for 2.5 days

    }
}
