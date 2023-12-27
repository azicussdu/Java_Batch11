package week10.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_2 {
    public static void main(String[] args) {

        // -------------- ex 1 -------------------
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a word: ");
//        String str = scan.next(); // str = ok
//
//        try {
//            System.out.println("The 3rd letter(or on index 2) in your word is: " + str.charAt(2));
//        }
//        catch(Exception ex){
//            System.out.println(ex.getMessage());
////            System.out.println("Oops, exception happened, but we did handle it!");
//        }
//
//        //When exception happens, we don't see this message below
//        System.out.println("This is the end of program");

        // ---------------- ex2------------------------

        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("enter 1st number: ");
            int num1 = scan.nextInt();

            System.out.print("enter 2nd number: ");
            int num2 = scan.nextInt();

            System.out.println("num1 / num2 = " + (num1 / num2));
        }
        catch(ArithmeticException ex){ // this block executed only if ArithmeticException happens
            System.out.println("Can not divide by 0");
        }
        catch (InputMismatchException ex){ // this block executed only if InputMismatchException happens
            System.out.println("Please enter only integers");
        }
        finally { //block that is executed anyway (if exception happens or of not happens)
            System.out.println("This message you will see anyway");
        }

        System.out.println("This is the end of program");

    }
}
