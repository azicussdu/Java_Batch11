package week6.day5.practice;

public class TestClient {
    public static void main(String[] args) {

        Client cl1 = new Client("John", 1255);
        cl1.ba.deposit(5000);
        System.out.println(cl1);
        System.out.println("-------------");

        cl1.ba.withdraw(2500);
        System.out.println(cl1);

        cl1.ba.withdraw(400);
        System.out.println(cl1);
    }
}
