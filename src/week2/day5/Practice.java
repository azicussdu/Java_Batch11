package week2.day5;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        /*
        User inputs a number.
        We have to check the number,
        if the number 2-digit - print "Yes",
        otherwise print "No".
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter a number: ");
//        int num = scan.nextInt();
//
//        if(num >= 10 && num <= 99){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }

        /*
        User enters two numbers.
        If both of them are positive OR both are negative - print "Yes".
        Otherwise print "No";

        enter two numbers: 12 15
        Yes

        enter two numbers: -12 -15
        Yes

        enter two numbers: -12 15
        No
         */


//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter two numbers: ");
//
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//
//        if( (num1>0 && num2>0) || (num1<0 && num2<0) ){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

        /*
        Program asks a user to input a password.

        Check if the password is valid. It is valid if:
            length >= 8
            length <= 12
            it should NOT contain word "pass" inside

        Print one of message: "Valid", "Not valid".
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter your password: ");
//        String password = scan.next();
//
//        int passLength = password.length();
//
//        if(passLength >= 8 && passLength <= 12 && !password.contains("pass")){
//            System.out.println("Valid");
//        }
//        else{
//            System.out.println("Not valid");
//        }

//        ---------------------------------------------

//        int num = (2 + 2) * 3; // so if you put parantheses - then + is done first
//        System.out.println("num = " + num);

        // ------------------- HOMETASK ---------------------

        /*
        User inputs a month number (1-12).
        Print "Winter" if it is a winter month(12, 1, 2).
        Otherwise print "Not winter".

        Try to do it with OR and AND operators together.
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter a month number: ");
//
//        int month = scan.nextInt(); //month = 12
//
//        if(month == 12 || (month >= 1 && month <= 2)){
//            System.out.println("Winter month");
//        }
//        else {
//            System.out.println("Not winter month");
//        }


        /*
        User enters two numbers.
        If both of them are odd, or both of them are even then print - "Yes".
        Otherwise print "No".

        enter two numbers: 5 7
        Yes

        enter two numbers: 4 6
        Yes

        enter two numbers: 7 8
        No
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter two number: ");
//
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//
//        if(a%2==0 && b%2==0 || a%2==1 && b%2==1){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }


        /*
        User inputs 3 numbers. num1, num2 and num3.

        If num2 is located between num1 and num3 then print - "Yes",
        otherwise print "No"

        enter 3 numbers:  10 15 20
        Yes

        enter 3 numbers:  20 15 10
        Yes

        enter 3 numbers: 15 20 10
        No
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter three number: ");
//
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//
//        // num1=10  num2=15  num3=20  // first case (when num1 is min, num3 is max)
//        // num1=20  num2=15  num3=10  // second case (when num3 is min, num1 is max)
//
//        if(num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }

    }
}
