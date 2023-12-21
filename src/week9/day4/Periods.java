package week9.day4;

import java.time.LocalDate;
import java.time.Period;

public class Periods {
    public static void main(String[] args) {

        // Period class we use to see difference in two DATES

//        LocalDate date1 = LocalDate.of(2023, 11, 25);
//        LocalDate date2 = LocalDate.of(2023, 12, 15);
//
//        Period diff1 = Period.between(date1, date2);
//        System.out.println("diff in years = " + diff1.getYears());
//        System.out.println("diff in month = " + diff1.getMonths());
//        System.out.println("diff in days = " + diff1.getDays());

        // 25.11.2023
        // 15.12.2023

        //  20 days = 0 month + 20 days

        // -----------------------------------------------

        LocalDate date1 = LocalDate.now();
        date1 = date1.plus(Period.of(1, 2, 3)); // or Period.ofWeeks(3)

        System.out.println(date1);
    }
}
