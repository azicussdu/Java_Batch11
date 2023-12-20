package week9.day3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Dates_1 {
    public static void main(String[] args) {

        //LocalDate.now() - returns you the object of current date
//        LocalDate date1 = LocalDate.now();

//        System.out.println("date1 = " + date1);
//        System.out.println("date1.getYear() = " + date1.getYear());
//        System.out.println("date1.getMonth() = " + date1.getMonth());
//        System.out.println("date1.getMonthValue() = " + date1.getMonthValue());
//        System.out.println("date1.getDayOfMonth() = " + date1.getDayOfMonth());
//        System.out.println("date1.getDayOfWeek() = " + date1.getDayOfWeek());
//        System.out.println("date1.getDayOfYear() = " + date1.getDayOfYear());
//        System.out.println("date1.getDayOfWeek().getValue() = " + date1.getDayOfWeek().getValue());

//        ---------------------------------------------------

        LocalDate date1 = LocalDate.now();
        date1 = date1.minusDays(17);

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("date in format dd/MM/yyyy = " + date1.format(fm1));

        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("date in format d/M/yy = " + date1.format(fm2));

        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy").withLocale(Locale.of("en", "US"));
        System.out.println("date in format EEEE dd.MM.yyyy = " + date1.format(fm3));

        DateTimeFormatter fm4 = DateTimeFormatter.ofPattern("EE dd.MM.yyyy").withLocale(Locale.of("en", "US"));
        System.out.println("date in format EE dd.MM.yyyy = " + date1.format(fm4));

        DateTimeFormatter fm5 = DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.yyyy").withLocale(Locale.of("en", "US"));
        System.out.println("date in format MMMM EEEE dd.MM.yyyy = " + date1.format(fm5));



    }
}
