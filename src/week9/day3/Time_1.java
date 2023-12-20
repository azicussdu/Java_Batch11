package week9.day3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_1 {
    public static void main(String[] args) {

//        LocalTime time1 = LocalTime.now();
//        System.out.println(time1);

        LocalTime time2 = LocalTime.of(22, 15, 30);
        System.out.println(time2);

        time2 = time2.plusHours(3);
        time2 = time2.minusMinutes(80);

//        System.out.println(time2); // 23:55:30

//        System.out.println("time2.getHour() = " + time2.getHour());
//        System.out.println("time2.getMinute() = " + time2.getMinute());
//        System.out.println("time2.getSecond() = " + time2.getSecond());
//        System.out.println("time2.getNano() = " + time2.getNano());

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("hh:mm:ss = " + time2.format(fm1));

        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("kk:mm:ss");
        System.out.println("kk:mm:ss = " + time2.format(fm2));

        DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("hh:mm a"); // hours = 23 (PM)
        System.out.println("hh:mm a = " + time2.format(fm3));

        time2 = time2.minusHours(12);
        System.out.println("hh:mm a = " + time2.format(fm3)); // hours = 11 (AM)

    }
}
