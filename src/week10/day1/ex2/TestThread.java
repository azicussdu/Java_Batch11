package week10.day1.ex2;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {

        for(int i=1; i<=10; i++){
            System.out.print("\r"+i);
            Thread.sleep(1000);
        }

    }
}
