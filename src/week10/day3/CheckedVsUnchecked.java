package week10.day3;

/*
Checked exceptions: are the type of exceptions,
that Java requires(forces) us to handle it - before running.
Example: InterruptedException

Unchecked exceptions: are the type exceptions, that Java does not require us to handle.
Simply, all classes of exception
which extend from RuntimeException class - they are unchecked exceptions.
Examples are: InputMismatchException, ArithmeticException, NullPointerException

NULL: is a keyword in Java that means the absence of any value.
EMPTY: It has a value, but value is empty.

NullPointerException: Thrown when an application attempts to use null
in a case where an object is required.
These include:
- Calling the instance method of a null object.
- Accessing or modifying the field of a null object.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedVsUnchecked {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter 1st number: ");
//        int num1 = scan.nextInt(); // num1 = 5
//
//        System.out.print("enter 2nd number: ");
//        int num2 = scan.nextInt(); // num2 = 0
//
//        System.out.println("num1 / num2 = " + (num1 / num2)); // unchecked exceptions
//
//        System.out.println("This is the end of program");

        // --------------------------------

        try {
            Thread.sleep(1000);   // checked exceptions
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        String str = null; // null
        showLetter(str);

    }

    public static void showLetter(String str){
        System.out.println(str.charAt(3));
    }
}
