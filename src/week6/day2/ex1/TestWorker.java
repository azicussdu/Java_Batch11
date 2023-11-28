package week6.day2.ex1;

public class TestWorker {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.name = "John";
        w1.age = 28;
        w1.cmpn = new Company();

        w1.cmpn.name = "Google";
        w1.cmpn.city = "London";

        System.out.println("worker company name: " + w1.cmpn.name);
        System.out.println("worker company city: " + w1.cmpn.city);

    }
}
