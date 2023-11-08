package week3.day3;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int num;

        do {
            System.out.print("enter a number: ");
            num = scan.nextInt();
            total = total + num;
        } while(num != 0);

        System.out.println("total = " + total);

    }
}
