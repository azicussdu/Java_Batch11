package week3.day2;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        /*
        The user inputs a number 1-7 day of a week.
        The program must print the name of this day (monday, tuesday...)
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter a week day number(1-7): ");
//        int num = scan.nextInt();
//
//        switch(num){
//            case 1: System.out.println("it is monday"); break;
//            case 2: System.out.println("it is tuesday"); break;
//            case 3: System.out.println("it is wednesday"); break;
//            case 4: System.out.println("it is thursday"); break;
//            case 5: System.out.println("it is friday"); break;
//            case 6: System.out.println("it is saturday"); break;
//            case 7: System.out.println("it is sunday"); break;
//            default: System.out.println("Wrong input");
//        }

        /*
        User inputs a month number (1-12).
        The program have to print the season's name.

        winter (1,2,12)
        spring (3,4,5)
        summer (6,7,8)
        autumn (9,10,11)
         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("enter a month number(1-12): ");
//        int month = scan.nextInt(); //month = 1

//        switch(month){
//            case 1:
//            case 2:
//            case 12: System.out.println("winter"); break;
//            case 3:
//            case 4:
//            case 5: System.out.println("spring"); break;
//            case 6:
//            case 7:
//            case 8: System.out.println("summer"); break;
//            case 9:
//            case 10:
//            case 11: System.out.println("autumn"); break;
//            default: System.out.println("Wrong input");
//        }

        // the new syntax of switch operator

//        switch(month){
//            case 1, 2, 12 -> System.out.println("winter");
//            case 3, 4, 5 -> System.out.println("spring");
//            case 6, 7, 8 -> System.out.println("summer");
//            case 9, 10, 11 -> System.out.println("autumn");
//            default -> System.out.println("Wrong input");
//        }

    }
}
