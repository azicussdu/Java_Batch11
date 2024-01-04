package week11.day2;

public class Q_19 {

    public static void someMethod() throws RuntimeException {
        System.out.println("Inside someMethod");
    }

    public static void main(String[] args) {
        someMethod(); // no need to handle (because Unchecked exception)
    }
}
