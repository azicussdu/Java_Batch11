package week4.day4;

public class Methods_3 {
    public static void main(String[] args) {
        printSeveralTimes(3, "Good bye");
        printSeveralTimes(5, "Bye bye");
    }

    public static void printSeveralTimes(int n, String word){ // int n and String word are parameters of a method
        for(int i=1; i<=n; i++){
            System.out.println(word);
        }
    }
}
