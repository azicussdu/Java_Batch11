package week9.day4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        /*
        Do it with Scanner class.
        Ask the user to enter his birthday: 20.12.1990
        Then print his age. Your age is 33

        Enter your birthday: 25.12.1990
        Your age is 32
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your birthdate in format 22.11.2000: ");
        String str = scan.nextLine();

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate birthDate = LocalDate.parse(str, fm1);
        LocalDate currentDate = LocalDate.now();

        Period diff = Period.between(birthDate, currentDate);
        System.out.println("Your age is " + diff.getYears() + " years");

//        boolean bln = birthDate.isAfter(currentDate);
//        boolean bln = birthDate.isBefore(currentDate);
//        System.out.println("bln = " + bln);



    }
}
