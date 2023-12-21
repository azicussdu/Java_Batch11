package week9.day4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        /*
        Do it with Scanner class.
        Ask the user to enter his birthday: 20.12.1990
        Need to show after how many days his birthday is

        Enter your birthday: 25.12.1990
        After 4 days we will celebrate
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your birthdate in format 22.11.2000: ");
        String str = scan.nextLine();

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate birthDate = LocalDate.parse(str, fm1);
        LocalDate currentDate = LocalDate.now();

        // 20.12.2000 -> 20.12.2024
        birthDate = birthDate.withYear(currentDate.getYear()+1);

        System.out.println(birthDate);

        Period diff = Period.between(currentDate, birthDate);
        int years = diff.getYears();
        int months = diff.getMonths();
        int days = diff.getDays();

        int totalDays = years * 365 + months * 30 + days;
        System.out.println("There are " + totalDays % 365 + " days till your birthday");



    }
}
