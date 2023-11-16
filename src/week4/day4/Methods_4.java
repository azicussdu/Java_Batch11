package week4.day4;

public class Methods_4 {

    public static void printNumbers(int from, int till){
        for(int i=from; i<=till; i++){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        printNumbers(3, 7); // should print: 3 4 5 6 7
    }
}
