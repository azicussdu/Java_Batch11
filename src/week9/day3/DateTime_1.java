package week9.day3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime_1 {
    public static void main(String[] args) {

//        LocalDateTime dt1 = LocalDateTime.now();
//        System.out.println(dt1);

        LocalDateTime dt2 = LocalDateTime.of(2023, 12, 30, 22, 30, 45);
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MMM/yy, hh:mm a").withLocale(Locale.of("en", "UK"));

        System.out.println(dt2.format(fm1));

    }
}
