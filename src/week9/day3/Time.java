package week9.day3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void showIn12Format(){ // 22:30:45 -> should print 10:30:45 PM

        if(hour < 12){ // then AM time
            if(hour == 0)
                System.out.println(12+":"+minute+":"+second+ " am");
            else
                System.out.println(hour+":"+minute+":"+second+ " am");
        }
        else{ // then PM time
            if(hour == 12)
                System.out.println(hour+":"+minute+":"+second+ " pm");
            else // hour > 12  if 22:30 -> 10:30 pm
                System.out.println((hour-12)+":"+minute+":"+second+ " pm");
        }

//        LocalTime time = LocalTime.of(hour, minute, second);
//        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
//        System.out.println(time.format(fm1));
    }

    public void showIn24Format(){ // 22:30:45 -> should print 22:30:45
        System.out.println(hour+":"+minute+":"+second);
    }

    public void addHours(int addedHours){
        int newHour = hour + addedHours;

        if(newHour > 23){
            hour = newHour % 24;
        }
    }

    public void minusHours(int substractedHours){
        // do it at home
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) { // check 0-23
        if(hour >= 0 && hour <= 23)
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) { //check 0-59
        if(minute >=0 && minute <= 59)
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) { // check 0-59
        if(second >= 0 && second <= 59)
            this.second = second;
    }

    public String toString(){
        return hour+":"+minute+":"+second;
    }
}
