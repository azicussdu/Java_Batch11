package week3.day3;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {

        /*
        The program always will ask the user
        to enter a number.
        After each input, the program calculates the total sum
        of all inputs of a user.

        When user inputs 0 - the loop should stop and the program
        have to show the total sum of all inputed numbers.
         */

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
