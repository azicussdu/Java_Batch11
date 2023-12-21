package week9.day4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) {

//        String str = "25.01.1999";

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("enter your bd in format 22.12.2023: ");
//        String str = scan.nextLine();
//
//        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//
//        LocalDate date1 = LocalDate.parse(str, fm1);
//        System.out.println(date1.format(fm1));

        // -----------------------------------------------

        String str2 = "22:30:15";

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalTime time1 = LocalTime.parse(str2, fm1);

        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time1.format(fm2));

    }
}
