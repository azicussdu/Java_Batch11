package week9.day4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Durations {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(22, 30, 0);
        LocalTime time2 = LocalTime.of(23, 45, 15);

        Duration dur1 = Duration.between(time1, time2);

        System.out.println("dur1.getSeconds() = " + dur1.getSeconds()); // 1h 15m 15s

        System.out.println("to hours = " + dur1.toHours());
        System.out.println("to minutes = " + dur1.toMinutes());
        System.out.println("to seconds = " + dur1.toSeconds());



    }
}
