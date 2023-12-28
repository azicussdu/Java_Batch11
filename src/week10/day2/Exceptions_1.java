package week10.day2;

import java.util.Scanner;

public class Exceptions_1 {
    public static void main(String[] args) {

        // -------------- ex 1 -------------------
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a word: ");
//        String str = scan.next(); // str = ok
//
//        // Let's assume that user enter "ok".
//        // Java tries to find 3rd letter, but there is no 3rd letter
//        // So it causes an error (exception ~ error)
//        System.out.println("The 3rd letter in your word is: " + str.charAt(2));
//
//        System.out.println("This is the end of program");

        // ---------------- ex2 -----------------------

        Scanner scan = new Scanner(System.in);

        System.out.print("enter 1st number: ");
        int num1 = scan.nextInt(); // num1 = 5

        System.out.print("enter 2nd number: ");
        int num2 = scan.nextInt(); // num2 = 0

        System.out.println("num1 / num2 = " + (num1 / num2)); // java threw an exception

        System.out.println("This is the end of program");
    }
}
