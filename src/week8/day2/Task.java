package week8.day2;

public class Task {
    /*
    create Worker:
        String name;
        double salary;
        create: getters/setters/constructors/toString()
        public double calculateSalary(){} - just should return salary

    create HRWorker (extends from Worker)
        int yearsOfExperience;
        public double calculateSalary(){} - return salary * coefficient
            (coefficient is bigger if yearsOfExp is more)

    create Manager (extends from Worker)
        int teamMembers;
        public double calculateSalary(){} - return salary * coefficient
            (coefficient is bigger if teamMembers is more)

    create enum Level {JUNIOR, MIDDLE, SENIOR}

    create Tester (extends from Worker)
        Level level
        public double calculateSalary(){} - return salary * coefficient
            (coefficient depends on level of a tester)

    in TestWorker.java in main method:
        create at least 2 HRWorkers, 2 Managers, 2 Testers
        add them all to an ArrayList

    do foreach with this arraylist:
        calculate the totalSalaries for all workers in ArrayList
        calculate the salaries only for HRWorkers
        calculate the salaries only for Managers
        calculate the salaries only for Tester

    example of output:
        Total salaries of all workers in company = 53 000 000 $
        Total salaries only for HRWorkers        = 20 000 000 $
        Total salaries only for Managers         = 15 000 000 $
        Total salaries only for Testers          = 18 000 000 $

     */
}
