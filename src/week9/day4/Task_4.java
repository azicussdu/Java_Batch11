package week9.day4;

import week9.day2.ex1.Laptop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    /*
    Ask the user the amount money he/she has to pay:  60 000 $
    Ask the user in how many months he/she has to pay: 12
    Ask when he/she starts to pay: 25.03.2024

    1 pay is in 25.03.2024 - 5000 $
    2 pay is in 25.04.2024 - 5000 $
    3 pay is in 25.05.2024 - 5000 $
    ....
    11 pay is in 25.01.2025 - 5000 $
    12 pay is in 25.02.2025 - 5000 $
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");
        int moneyAmount = scan.nextInt();
        System.out.print("Enter the amount of month: ");
        int monthAmount = scan.nextInt();

        System.out.print("Enter the date: ");
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String strDate = scan.next(); // read the date

        LocalDate date = LocalDate.parse(strDate, fm1);

        for(int i=1; i<=monthAmount; i++){
//            1 pay is in 25.03.2024 - 5000 $
            System.out.println(i + " pay is in " + date.format(fm1) + " - " + (moneyAmount / monthAmount));
            date = date.plusMonths(1);
        }

    }
}
