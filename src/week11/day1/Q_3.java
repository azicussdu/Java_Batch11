package week11.day1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_3 {
    public static void main(String[] args) {

        String date = LocalDate.
                parse("2014-05-04") // an exception thrown
                .format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(date);

    }
}
