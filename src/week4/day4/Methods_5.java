package week4.day4;

public class Methods_5 {

    public static void printNumbers(int from, int till, int step){
        for(int i=from; i<=till; i=i+step){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        printNumbers(5, 20, 4); // should print: 5 9 13 17
    }
}
