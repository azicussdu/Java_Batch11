package week3.day3;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {

        /*
        Print the numbers from 10 to 20(included).
         */

//        int a = 10;
//        while(a <= 20){
//            System.out.println(a);
//            a = a + 1;
//        }

        /*
        Print "Hi" 5 times
         */

//        int a = 1;
//
//        while(a <= 5){
//            System.out.println("hi");
//            a = a + 1;
//        }

        /*
        Find the sum of numbers between 1 and 10, then
        show the result.
         */

//        int a = 1;
//        int total = 0;
//
//        while(a <= 10){
//            total = total + a;
//            a = a + 1;
//        }
//
//        System.out.println("total = " + total);

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

        System.out.print("enter a number: ");
        int num = scan.nextInt();

        while(num != 0){
            total = total + num;
            System.out.print("enter a number: ");
            num = scan.nextInt();
        }

        System.out.println("total = " + total);

    }
}
