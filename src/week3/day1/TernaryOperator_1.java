package week3.day1;

import java.util.Scanner;

public class TernaryOperator_1 {
    public static void main(String[] args) {

//        String result;
//        int num = 4;
//
//        if(num % 2 == 0){
//            result = "even";
//        }
//        else {
//            result = "odd";
//        }
//
//        System.out.println("result is: " + result);

        // --------- now with ternary operator --------------

//        String result;
//        int num = 4;
//
//        result = (num % 2 == 0 ? "even" : "odd");
//        System.out.println("result is: " + result);

        // ------------another way with ternary operator --------

//        int num = 6;
//        System.out.println("result is: " + (num % 2 == 0 ? "even" : "odd"));

        /*
        User enters his mark, if it is 50 or above - print "Passed",
        otherwise print "failed".
         */

//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter your mark: ");
//        int mark = scan.nextInt();
//
//        System.out.println(mark>=50 ? "passed" : "failed");

        /*
        User inputs a number, so program have to print one of following messages:
        positive, negative, zero.
         */

//        int num = 0;
//
//        if(num == 0){
//            System.out.println("zero");
//        }
//        else{ // num is either positive or negative
//            if(num < 0)
//                System.out.println("negative");
//            else
//                System.out.println("positive");
//        }

        // ----------- now let's do it with ternary operator ------------

//        Scanner scan = new Scanner(System.in);
//        System.out.print("enter a number: ");
//
//        int num = scan.nextInt();
//        String result;
//
//        result = (num==0 ? "zero" : (num<0 ? "negative" : "positive"));
//        System.out.println("result is: " + result);

        /*
        User enters amount of hours his car was staying at parking.
        If it is less than 3 hours, so 2$ to pay.
        If between 3-5 hours, so 5$ to pay.
        If more than 5 hours, so 10$ to pay.
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter hours: ");
//        int hours = scan.nextInt(); // hours = 2
//
//        System.out.println(hours<3 ? "2$" : (hours<=5 ? "5$" : "10$"));
    }
}
