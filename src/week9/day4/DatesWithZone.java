package week9.day4;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DatesWithZone {
    public static void main(String[] args) {

//        ZonedDateTime zdt = ZonedDateTime.now();
//        System.out.println(zdt);

//        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
//        System.out.println(zdt);

        // to see all zones in the world
//        Set<String> allZones = ZoneId.getAvailableZoneIds();
//
//        for(String zone : allZones){
//            System.out.println(zone);
//        }

        // convenient to convert datetime from one zone to another zone
        LocalDateTime myTime = LocalDateTime.of(2023, 12, 22, 1, 30, 30);
        // myTime = 22.12.2023 15:30:30

        ZonedDateTime timeInIstanbul =
                ZonedDateTime.of(myTime, ZoneId.of("Asia/Almaty"))
                        .withZoneSameInstant(ZoneId.of("Europe/Istanbul"));

        System.out.println("myTime = " + myTime);
        System.out.println("timeInIstanbul = " + timeInIstanbul);
    }
}
