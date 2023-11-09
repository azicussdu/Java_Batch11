package week3.day4;

import java.util.Scanner;

public class RecapOfWhile {
    public static void main(String[] args) {

        /*
        User will input numbers one by one.
        When the user inputs 0, the loop should be stopped.
        Print the amount of odd numbers user entered.

        enter a number: 4
        enter a number: 7
        enter a number: 3
        enter a number: 0

        amount of odd numbers is: 2
         */

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int num;

        do {
            System.out.print("enter a number: ");
            num = scan.nextInt();

            if(num % 2 == 1){
                count = count + 1;
            }

        } while(num != 0); //while the num is not 0 so continue the loop

        System.out.println("amount of odd numbers is: " + count);




    }
}
