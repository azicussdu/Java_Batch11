package week9.day4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        /*
        Ask the user how many pills he/she have to drink in one day (5)
        Ask the duration between pills (each 3 hours)
        Ask the time when he starts to drink pills (08:30)

        1 pill - 08:30
        2 pill - 11:30
        3 pill - 14:30
        4 pill - 17:30
        5 pill - 20:30
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("enter how many pills you have: ");
        int amountOfPills = scan.nextInt();

        System.out.print("enter each how many hours you have drink: ");
        int hoursPeriod = scan.nextInt();

        System.out.print("enter the time to start drinking pills like (08:00): ");
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("kk:mm");
        String strTime = scan.next();

        LocalTime time = LocalTime.parse(strTime, fm1);

        for(int i=1; i<=amountOfPills; i++){
            System.out.println("drink " + i + " pill in " + time.format(fm1));
            time = time.plusHours(hoursPeriod);
        }

    }
}
