package week8.day2.hometask;

import java.util.ArrayList;

public class TestWorkers {
    public static void main(String[] args) {

        HRWorker hr1 = new HRWorker("John", 5000, 3);
        HRWorker hr2 = new HRWorker("Jane", 6000, 5);
        Manager m1 = new Manager("Mike", 10000, 12);
        Manager m2 = new Manager("Mary", 10000, 8);
        Tester t1 = new Tester("Hanna", 120000, Level.MIDDLE);
        Tester t2 = new Tester("Jeniffer", 9000, Level.SENIOR);

        ArrayList<Worker> workersList = new ArrayList<>();
        workersList.add(hr1);
        workersList.add(hr2);
        workersList.add(m1);
        workersList.add(m2);
        workersList.add(t1);
        workersList.add(t2);

        double totalSalary = 0;
        double hrSalary = 0;
        double mngSalary = 0;
        double tstSalary = 0;

        for(Worker worker : workersList) {
            totalSalary = totalSalary + worker.calculateSalary();

            if(worker instanceof HRWorker)
                hrSalary = hrSalary + worker.calculateSalary();
            else
                if(worker instanceof Manager)
                    mngSalary = mngSalary + worker.calculateSalary();
                else
                    if(worker instanceof Tester)
                        tstSalary = tstSalary + worker.calculateSalary();
        }

        System.out.println("total salary = " + totalSalary);
        System.out.println("hr worker salaries = " + hrSalary);
        System.out.println("manager salaries   = " + mngSalary);
        System.out.println("tester salaries    = " + tstSalary);
    }
}
